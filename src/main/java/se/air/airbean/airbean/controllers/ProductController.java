package se.air.airbean.airbean.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import se.air.airbean.airbean.repositories.ProductRepository;

@RestController
public class ProductController {

  @Autowired private ProductRepository repository;

//  @GetMapping("/products")
//  public Iterable<Product> getAllProducts() {
//    return repository.findAll();
//  }
}
