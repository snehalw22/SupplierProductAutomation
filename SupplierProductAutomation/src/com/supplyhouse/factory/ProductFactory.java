

package com.supplyhouse.factory;

import com.supplyhouse.product.Product;
/**
 * 
 * @author Snehal
 * A Factory to generate the Product objects.
 * 
 * Implements Factory Design Pattern
 *
 */
public class ProductFactory {
private ProductFactory() {}
	
	public static Product createProduct(int productID) throws Exception
	{
			return new Product(productID);
	}
}
