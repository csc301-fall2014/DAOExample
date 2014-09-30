package csc301;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Extend the in-memory DAO implementation - Make sure that the data is 
 * saved in a local file. 
 */
public class TrainCompanyLocalFileDAO extends TrainCompanyInMemoryDAO {

	
	private String dataFilename;
	
	public TrainCompanyLocalFileDAO(String dataFilename) throws IOException {
		this.dataFilename = dataFilename;
		loadData(this.dataFilename);
	}
	
	
	@Override
	public TrainCompany createInstance(String name) {
		return createInstance(name, true);
	}
	
	
	
	//-------------------------------------------------------------------------
	// Helper methods to load/save data from a local file
	// We assume that the local file contains the names of all companies, one per line.
	
	
	private void loadData(String filename) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line = br.readLine();
		while(line != null){
			line = line.trim();
			if(line.isEmpty()){
				continue;
			}
			
			createInstance(line, false);
			line = br.readLine();
		}
		br.close();
	}
	
	
	/**
	 * Save the given train company in the specified file. 
	 */
	private void saveData(String filename, TrainCompany trainCompany) throws IOException{
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(this.dataFilename, true)));
	    out.println(trainCompany.getName());
	    out.close();
	}
	
	
	//-------------------------------------------------------------------------
	
	
	/**
	 * A private version of createInstance, where we can specify whether or not 
	 * we want to save the new instance in our data file.
	 * 
	 * See the loadData(String filename) to understand why this helper is useful.
	 */
	private TrainCompany createInstance(String name, boolean shouldPersist) {
		TrainCompany company = super.createInstance(name);
		
		// Persist the data, if necessary.
		if(shouldPersist){
			try {
				saveData(this.dataFilename, company);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		
		return company;
	}
	

}
