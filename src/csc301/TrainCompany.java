package csc301;

public class TrainCompany {

	
	public static TrainCompany createInstance(String name){
		// TODO: Verify that the name is valid, and is not taken already ...  
		return new TrainCompany(name);
	}
	
	
	public static TrainCompany getInstance(String name){  
		return null;
	}
	
	
	
	
	
	
	private String name;
	
	private TrainCompany(String name) {
		setName(name);
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
