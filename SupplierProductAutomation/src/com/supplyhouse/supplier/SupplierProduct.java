package com.supplyhouse.supplier;

import java.io.Serializable;

import com.supplyhouse.product.Product;
/**
 * @author Snehal
 * SupplierProduct class representing the SupplierProduct table.
 * Conatins references for Supplier and Product object which is a composite key in the SupplierProduct table.
 * It Has a constructors and getters and setters.
 */
public class SupplierProduct  implements Serializable{
	private static final long serialVersionUID = 1L;
	private Supplier supplier;
	private Product product;
	private double quantity;
		
	private SupplierProduct(){}
		
	public SupplierProduct(Supplier supplier, Product product, double quantity) {
		setSupplier(supplier);
		setProduct(product);
		setQuantity(quantity);
	}
	
	public Supplier getSupplier() throws Exception{
	
		return supplier;
	}
	
	private void setSupplier(Supplier supplier) {
		// Handle any type of validations for supplierId and throw/catch detailed exception
		this.supplier = supplier;
	}
	
	public Product getProduct() {
		return product;
	}
	
	private void setProduct(Product product) {
		// Handle any type of validations for supplierId and throw/catch detailed exception
		this.product = product;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	private void setQuantity(double quantity) {
		// Handle any type of validations for supplierId and throw/catch detailed exception
		this.quantity = quantity;
	}
}
