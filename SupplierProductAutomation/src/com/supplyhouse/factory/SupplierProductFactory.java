package com.supplyhouse.factory;

import com.supplyhouse.product.Product;
import com.supplyhouse.supplier.Supplier;
import com.supplyhouse.supplier.SupplierProduct;
/**
 * 
 * @author Snehal
 * A Factory to generate the SupplierProduct object.
 * 
 * Implements Factory Design Pattern
 *
 */
public class SupplierProductFactory {
private SupplierProductFactory() {}
	
	public static SupplierProduct createSupplierProduct(Supplier supplierId,Product productID,double quantity) throws Exception
	{
			return new SupplierProduct(supplierId,productID,quantity);
	}
}

