package com.sudhish.ProductManagement.MyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sudhish.ProductManagement.Repo.ProductRepo;
import com.sudhish.ProductManagement.domain.ProductDetails;

@RestController
public class ProductController {

	private ProductRepo productRepository;

	@Autowired
	public ProductController(ProductRepo productRepository) {
		this.productRepository = productRepository;
	}

	@GetMapping("/products")
	public List getProducts() {
		return productRepository.findAll();
	}

	@PostMapping("/products")
	public ProductDetails save(@RequestBody ProductDetails product) {
		return (ProductDetails) productRepository.save(product);
	}
}