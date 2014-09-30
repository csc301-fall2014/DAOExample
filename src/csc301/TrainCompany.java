package csc301;

public class TrainCompany {
	
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
