package com.supplyhouse.properties;
import java.util.Properties;
/**
 * @author Snehal
 * Class to load the properties like input file location and database details from the properties file
 */
public class AutomationProperties {

	private Properties properties;
	
	private AutomationProperties() throws Exception{	
		// Load the resources properties file in the properties 
	}
	public String getFileDirectory()
	{
		return properties.getProperty("fileDirectory");
	}
	public String getDatabaseUrl()
	{
		return properties.getProperty("url");
	}
	public String getDatabaseDriver()
	{
		return properties.getProperty("driver");
	}
}
