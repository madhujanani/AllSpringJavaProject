package org.training.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.springmvc.model.Product;
import org.training.springmvc.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService prodserv;
	
	@GetMapping("/list")
	public String getProductDetails(ModelMap map) {
		List<Product> prodList = prodserv.getAllProducts();
		map.addAttribute("productDetails",prodList);		
		return "products";
	}
	@GetMapping("/byId/{id}")
	public String getProductById( @PathVariable int id,ModelMap map) {
		Product prod = prodserv.getProductById(id);
		map.addAttribute("product",prod);		
		return "singleProduct" ;
		}
	//create,delete,update not working yet
	@GetMapping("/create")
	public String createProduct( @PathVariable Product pro, ModelMap map) {
		boolean createprod = prodserv.createProduct(pro);
		map.addAttribute("createprod",createprod);		
		return "createProduct" ;
		}
	@GetMapping("/update/{id}")
	public String updateProduct( @PathVariable Product id, ModelMap map) {
		boolean updateprod = prodserv.updateProduct(id);
		map.addAttribute("updateprod",updateprod);		
		return "updateProduct" ;
		}
	@GetMapping("/delete/{id}")
	public String deleteProduct( @PathVariable Product id, ModelMap map) {
		boolean deleteprod = prodserv.updateProduct(id);
		map.addAttribute("deleteprod",deleteprod);		
		return "products"; 
		}

}
