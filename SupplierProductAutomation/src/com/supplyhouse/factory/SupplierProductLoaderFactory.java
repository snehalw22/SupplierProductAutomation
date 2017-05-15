package com.supplyhouse.factory;

import com.supplyhouse.supplier.SupplierProductCSVLoader;
import com.supplyhouse.supplier.SupplierProductLoader;
import com.supplyhouse.supplier.SupplierProductXMLLoader;
/**
 * 
 * @author Snehal
 * A Factory to generate the objects of interface implementation of SupplierProductLoader on the basis of the file type provided.
 * 
 * Implements Factory Design Pattern
 *
 */
public class SupplierProductLoaderFactory {

	private SupplierProductLoaderFactory() {}

	public static SupplierProductLoader getSupplierInventoryLoader(String fileType)
	{
	if (fileType.equalsIgnoreCase("xml"))
	{
		return new SupplierProductXMLLoader();
	}else if(fileType.equalsIgnoreCase("csv"))
	{
		return new SupplierProductCSVLoader();
	}
	else return null;
	}
}

