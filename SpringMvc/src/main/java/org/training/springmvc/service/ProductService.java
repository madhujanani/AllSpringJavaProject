package org.training.springmvc.service;

import java.util.List;

import org.training.springmvc.model.Product;

public interface ProductService {
	Product getProductById(int  PRODUCT_ID);
	List<Product> getAllProducts();
	boolean deleteProduct(Product pro);
	boolean updateProduct(Product pro);
	boolean createProduct(Product pro);


}
