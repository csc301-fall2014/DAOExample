package csc301;


public class Main {

	/*
	 * NOTICE: This method can "do something useful" with any 
	 * implementation of a TrainCompanyDAO.
	 * 
	 * That is, if/when we choose to switch a DAO implementation, this
	 * code will not need to change.
	 */
	public static void doSomethingUseful(TrainCompanyDAO dao){
		TrainCompany c1 = dao.createInstance("FastTrain");
		TrainCompany c2 = dao.createInstance("SwiftRail");
		
		// TODO: Actually do something useful, instead of just printing ...
		System.out.println(c1);
		System.out.println(c2);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		/*
		 * NOTE
		 * As some of your mentioned in class, we still have a dependency
		 * on a specific DAO implementation.
		 * 
		 * For example, in this code, we are explicitly creating an instance of TrainCompanyInMemoryDAO.
		 * 
		 * This dependency means that if/when we switch a DAO implementation, 
		 * we will need to change this code.
		 * This is not terrible - There is only one thing that needs to change, the
		 * part where we instantiate our DAO implementation.
		 * 
		 * Later in the term, we will talk about a design pattern that allows us to 
		 * remove this type of dependencies.
		 */
		TrainCompanyDAO dao = new TrainCompanyInMemoryDAO();
		
		doSomethingUseful(dao);
	}
	
}
