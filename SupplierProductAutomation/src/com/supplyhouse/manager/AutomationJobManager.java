package com.supplyhouse.manager;

import java.io.File;
import java.util.ArrayList;
/**
 * 
 * @author Snehal
 * A Manager class to which runs the job to automate the file processing.
 * 
 * Used Singleton, Facade Design Pattern
 *
 */
public class AutomationJobManager {
	private static AutomationJobManager automationJobManager = null;

	public static AutomationJobManager getInstance() {
		if (automationJobManager == null) {
			synchronized (AutomationJobManager.class) {
				if (automationJobManager == null)
					automationJobManager = new AutomationJobManager();
			}
		}
		return automationJobManager;
	}
	
	private AutomationJobManager() {}
	
	public void runJob()
	{
		ArrayList<File> files;
		//read the files from directory by accessing automation properties for location
		files = getFiles("");
		
		//get the interface inplementation from SupplierProductLoaderFactory on the basis of file type
		
		// load the SupplierProduct
		
		//Get a connection from ConnectionManager and save the files	
	}
	
	public ArrayList<File> getFiles(String location)
	{		
		return null;		
	}

}
