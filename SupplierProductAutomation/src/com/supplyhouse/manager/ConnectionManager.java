package com.supplyhouse.manager;
import java.sql.*;
/**
 * 
 * @author Snehal
 * A singleton class to access the connections so that there is only one ConnectionManager
 * to handle the connections throughout the application.
 * 
 * Used Singleton, Facade Design Pattern
 *
 */
public class ConnectionManager {
	String driver;
	String url;
	String username;
	String password;

	private static ConnectionManager connectionManager = null;

	public static ConnectionManager getInstance() {
		if (connectionManager == null) {
			synchronized (ConnectionManager.class) {
				if (connectionManager == null)
					connectionManager = new ConnectionManager();
			}
		}
		return connectionManager;
	}
	
	private ConnectionManager() {
		//create a ConnectionManager using the connection details from properties file
	}

	public Connection getConnection() throws SQLException {
		//returns a connection
		return null;
	}

}