package com.supplyhouse.dao;

import com.supplyhouse.supplier.SupplierProduct;
/**
 * @author Snehal
 * An interface containing abstract methods to perform database related operations on SupplierProduct objects
 */
public interface SupplierProductDao {
	   public void updateSupplierProduct(SupplierProduct supplierProduct);
	   public void insertSupplierProduct(SupplierProduct supplierProduct);
}
