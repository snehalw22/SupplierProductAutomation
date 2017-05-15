package com.supplyhouse.supplier;

import java.io.Serializable;
/**
 * @author Snehal
 * Supplier class representing the Supplier table
 * Has a constructors and getters and setters
 */
public class Supplier implements Serializable{

	private static final long serialVersionUID = 1L;
	private int supplierId;

	private Supplier(){}
	
	public Supplier(int supplierId) throws Exception{
		setSupplierId(supplierId);
	}

	public int getSupplierId() {
		return supplierId;
	}

	private void setSupplierId(int supplierId) throws Exception{
		// Handle any type of validations for supplierId and throw/catch exception 
		this.supplierId = supplierId;
	}	
}
