package com.ghrer.ecommerce.products.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class ProductsController {
	
	@GetMapping("/")
	public Mono<String> getProducts(){
		return Mono.just("Hello");
	}

}
