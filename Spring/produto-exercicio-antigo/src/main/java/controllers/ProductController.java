package controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Repositories.ProductRepository;
import models.Product;



@RestController
@RequestMapping(value ="/products")
public class ProductController {
	
	private ProductRepository repository;
	
	
	@PostMapping
	public Product save(@RequestParam String name) {
		var p = new Product(name); 
		repository.save(p);
		return p;
	}
	
	

}
