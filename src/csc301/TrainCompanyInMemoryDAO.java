package csc301;

import java.lang.reflect.Constructor;

public class TrainCompanyInMemoryDAO implements TrainCompanyDAO {

	@Override
	public TrainCompany createInstance(String name) {
		// TODO: Verify that the name is valid, and is not taken already ...
		
		TrainCompany company = instantiateTrainCopmany(name);
		
		// TODO: Save a reference to this instance somewhere (so that getInstance will be able to return it) ...
		
		return company;
	}

	
	@Override
	public TrainCompany getInstance(String name) {
		return null;
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
