package belajar_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import belajar_spring.repository.ProductRepository;
import lombok.Getter;

@Component
public class ProductService {

    @Getter
    private ProductRepository productrepository;


  @Autowired
  public ProductService(ProductRepository productRepository){
    this.productrepository = productRepository;
  }

  public ProductService(ProductRepository productRepository, String name){
    this.productrepository = productRepository;
  }
}
