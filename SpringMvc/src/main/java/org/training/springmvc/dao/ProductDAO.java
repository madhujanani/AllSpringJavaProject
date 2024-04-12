package org.training.springmvc.dao;

import java.util.List;

import org.training.springmvc.model.Product;

public interface ProductDAO {
	Product getProductById(int  PRODUCT_ID);
	List<Product> getAllProducts();
	boolean deleteProduct(Product pro);
	boolean updateProduct(Product pro);
	boolean createProduct(Product pro);
}
