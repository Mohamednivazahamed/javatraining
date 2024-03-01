package com.tcs.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.services.ProductService;
import com.tcs.rest.resource.Product;
@RestController
@RequestMapping
public class ProductResource {
	@Autowired
	ProductService service;
	
	@GetMapping
	public String check() {
		
		return "/product/api.1.0";
	}
	

	@GetMapping
	@RequestMapping("/allproducts")
	public List<Product> showAllProducts(){
		//int a=5/0;
	 return service.getProducts();
	 
	}
	
	@GetMapping("/productid/{id}")
	public Product fetchProduct(@PathVariable int id){
		return service.getProductById(id);
	}
	
	@PostMapping
	@RequestMapping(
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			value="/addproduct")
	public Product createProduct(@RequestBody Product product) {
		return service.save(product);
	}
	
	@PutMapping
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
	produces = MediaType.APPLICATION_JSON_VALUE, value = "/modifyproduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.update(product);
	}
	
	@PutMapping
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
	produces = MediaType.APPLICATION_JSON_VALUE, value = "/deleteproduct")
	public Product deleteProduct(@RequestBody Product product) {
		return service.delete(product);
	}
}
