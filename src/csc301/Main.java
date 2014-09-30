package csc301;

import java.io.IOException;


public class Main {

	/*
	 * NOTICE: This method can "do something useful" with any implementation of a TrainCompanyDAO.
	 * That is, if/when we choose to switch a DAO implementation, this
	 * code will not need to change.
	 */
	public static void doSomethingUseful(TrainCompanyDAO dao){
		TrainCompany c1 = dao.createInstance("FastTrain");
		System.out.println(c1);
		System.out.println(dao.getInstance("Via"));
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * NOTE
		 * ====
		 * 
		 * As some of your mentioned in class, this code still depends on specific DAO implementations.
		 * This dependency means that if/when we switch a DAO implementation, we will need to change this code.
		 * 
		 * This is not terrible - There is only one thing that needs to change, the
		 * part where we instantiate our DAO implementation.
		 * 
		 * Later in the term, we will talk about a design pattern that allows us to 
		 * remove this type of dependencies.
		 */
		
		// Instantiate a DAO ...
//		TrainCompanyDAO dao = new TrainCompanyInMemoryDAO();
		TrainCompanyDAO dao = new TrainCompanyLocalFileDAO("train-companies.txt");
		
		// Pass the DAO instance to someone who will use it ...
		doSomethingUseful(dao);
	}
	
}
