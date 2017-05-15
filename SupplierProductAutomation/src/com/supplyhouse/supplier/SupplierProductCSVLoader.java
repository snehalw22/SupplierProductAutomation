package com.supplyhouse.supplier;

import java.io.File;
import java.util.ArrayList;
/**
 * @author Snehal
 * An interface implementation of SupplierProductLoader which implements the abstarct methods to load the CSV file types
 * 
 * Used Strategy Design Pattern
 */
public class SupplierProductCSVLoader implements SupplierProductLoader{

	/**
	 * This method will take the file and implement the logic to read the file as a CSV document and convert it in an ArrayList of SupplierProduct.
	 */
	public ArrayList<SupplierProduct> loadSupplierProduct(File file) {
		return null;
	}

}