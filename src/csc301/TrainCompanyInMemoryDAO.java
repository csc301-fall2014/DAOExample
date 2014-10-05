package csc301;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class TrainCompanyInMemoryDAO implements TrainCompanyDAO {
	
	private static Map<String, TrainCompany> nameToTrainCompany = new HashMap<String, TrainCompany>();

	@Override
	public TrainCompany createInstance(String name) {
		name = normalizeName(name);
		TrainCompany company = instantiateTrainCopmany(name);
		nameToTrainCompany.put(name, company);
		return company;
	}

	
	@Override
	public TrainCompany getInstance(String name) {
		return nameToTrainCompany.get(name);
	}

	
	/**
	 * @throws IllegalArgumentException If the name is invalid, or taken.
	 * @return A normalized version of the given name (i.e. without any trailing white spaces).
	 */
	private String normalizeName(String name){
		if(name == null){
			throw new IllegalArgumentException("No null names please.");
		}
		name = name.trim();
		if(nameToTrainCompany.containsKey(name)){
			throw new IllegalArgumentException("The name'" + name + "' is already taken.");
		}
		return name;
	}
	
	
	/**
	 * An example of how you can call a private constructor using Reflections.
	 * This is not part of the course material, but I thought you should see it.
	 */
	private TrainCompany instantiateTrainCopmany(String name){
		try{
			// Get the constructor of TrainCompany that takes a single String argument
			Constructor<TrainCompany> constructor = TrainCompany.class.getDeclaredConstructor(String.class);
			// Override Java's access check
			constructor.setAccessible(true);
			// Call the constructor
			return constructor.newInstance(name);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
