package com.supplyhouse.product;

import java.io.Serializable;
/**
 * @author Snehal
 * Product class representing the Product table
 * Has a constructors and getters and setters
 */
public class Product  implements Serializable{

	private static final long serialVersionUID = 1L;
	private int productId;

	private Product(){}
	
	public Product(int productId) throws Exception{
		setProductId(productId);
	}

	public int getProductId() {
		return productId;
	}

	private void setProductId(int productId) throws Exception{
		// Handle any type of validations for productId and throw/catch exception 
		this.productId = productId;
	}	
}

