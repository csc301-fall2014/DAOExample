package csc301;


/**
 * This interface tells other classes how they can use train companies.
 * 
 * Other classes will program against this interface, without thinking 
 * about the underlying data storage.
 * If/when we decide to switch data storage (e.g. from in-memory to a remote database),
 * external code will not have to change).
 */
public interface TrainCompanyDAO {

	public TrainCompany createInstance(String name);
	public TrainCompany getInstance(String name);
	
}
