package com.supplyhouse.factory;

import com.supplyhouse.supplier.Supplier;
/**
 * 
 * @author Snehal
 * A Factory to generate the Supplier object.
 * 
 * Implements Factory Design Pattern
 *
 */
public class SupplierFactory {
private SupplierFactory() {}
	
	public static Supplier createSupplier(int supplierId) throws Exception
	{
			return new Supplier(supplierId);
	}
}
