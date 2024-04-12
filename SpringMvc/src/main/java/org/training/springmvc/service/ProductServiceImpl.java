package org.training.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.springmvc.dao.ProductDAO;
import org.training.springmvc.model.Product;
@Service
public class ProductServiceImpl  implements ProductService{
	@Autowired
	private ProductDAO productDao;

	@Override
	public Product getProductById(int PRODUCT_ID) {
		return productDao.getProductById(PRODUCT_ID);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override
	public boolean deleteProduct(Product pro) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(pro);
	}

	@Override
	public boolean updateProduct(Product pro) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(pro);
	}

	@Override
	public boolean createProduct(Product pro) {
		// TODO Auto-generated method stub
		return productDao.createProduct(pro);
	}
}
