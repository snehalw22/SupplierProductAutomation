package com.supplyhouse.supplier;

import java.io.File;
import java.util.ArrayList;
/**
 * @author Snehal
 * An interface implementation of SupplierProductLoader which implements the abstract methods to load the XML file types
 * 
 * Used Strategy Design Pattern
 */
public class SupplierProductXMLLoader implements SupplierProductLoader{

	/**
	 * This method will take the file and implement the logic to read the file as a XML document and convert it in an ArrayList of SupplierProduct.
	 */
	public ArrayList<SupplierProduct> loadSupplierProduct(File file) {
		return null;
	}

}
