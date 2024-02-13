package com.tcs.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public List<Product> getProducts(){
		List<Product> list= repo.findAll();
		return list;
		
	}
	public Product getProductById(int id) {
		Optional<Product> product = repo.findById(id);
		return product.get();
	}
	
	public Product save(Product p) {
		return repo.save(p);
		
	}
	
	public Product update(Product p) {
		Optional<Product> optional = repo.findById(p.getPID());
		Product tempProduct = optional.get();
		tempProduct.setDescription(p.getDescription());
		tempProduct.setP_amount(p.getP_amount());
		return repo.save(tempProduct);
	}
	
	public Product delete(Product p) {
		Optional<Product> optional = repo.findById(p.getPID());
		Product tempProduct = optional.get();
		System.out.println(p.getPID());
		repo.deleteById(p.getPID());
		return tempProduct;
	}

}
