package com.supplyhouse.supplier;

import java.io.File;
import java.util.ArrayList;
/**
 * @author Snehal
 * An interface containing abstract methods to load the files.
 */
public interface SupplierProductLoader {
	/**
	 * This is an abstract method which takes different file formats as an input.
	 * 
	 * @param file
	 * @return
	 */
	public ArrayList<SupplierProduct> loadSupplierProduct(File file);
}
