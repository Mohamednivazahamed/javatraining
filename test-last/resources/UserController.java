package com.tcs.bms.resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bms.services.AccountService;
import com.tcs.bms.services.UserService;




@RestController
@RequestMapping("/product/api.1.0")
@CrossOrigin("http://localhost:4200")
public class UserController {

		@Autowired
		AccountService accountService;
		
		@Autowired
		UserService userService;
		
		@GetMapping
		public String check() {
			
			return "/product/api.1.0";
		}
		

		@GetMapping
		@RequestMapping("/allproducts")
		public String showAllProducts(){
		 return "Hello";
		}
//		
//		@GetMapping("/productid/{id}")
//		public Product fetchProduct(@PathVariable int id){
//			return service.getProductById(id);
//		}
//		
//		@PostMapping
//		@RequestMapping(
//				consumes=MediaType.APPLICATION_JSON_VALUE,
//				produces=MediaType.APPLICATION_JSON_VALUE,
//				value="/addproduct")
//		public Product createProduct(@RequestBody Product product) {
//			return service.save(product);
//		}
//		
//		@PutMapping
//		@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
//		produces = MediaType.APPLICATION_JSON_VALUE, value = "/modifyproduct")
//		public Product updateProduct(@RequestBody Product product) {
//			return service.update(product);
//		}
//		
//		@PutMapping
//		@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
//		produces = MediaType.APPLICATION_JSON_VALUE, value = "/deleteproduct")
//		public Product deleteProduct(@RequestBody Product product) {
//			return service.delete(product);
//		}
//  
//
//
//  
    
   
    
    
  

    




}
