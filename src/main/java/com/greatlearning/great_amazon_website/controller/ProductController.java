package com.greatlearning.great_amazon_website.controller;


import com.greatlearning.great_amazon_website.entity.Product;
import com.greatlearning.great_amazon_website.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
       //return List.of(new Product(1L, "tv", "50,000"));
        return productRepository.findAll();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
    //public Product searchProduct(Long id) -->This wouldn't work as well. They guy said something about java needing-
    // -to have something called "optional"
    @GetMapping("/products/{id}")
    public ResponseEntity<?> searchProduct(@PathVariable Long id){
        Optional<Product>product = productRepository.findById(id);
        if(product.isPresent()){
            return ResponseEntity.ok(product.get());
        }
        return ResponseEntity.notFound().build();
        //return productRepository.findById(id); ---> Wouldn't work so we had to another way on java ^
    /* return product.map(pr-> ResponseEntity.ok(pr))
            .orElse(ResponseEntity.notFound().build());
        return productRepository
                .map(pr-> ResponseEntity.ok(pr))
                .orElse(ResponseEntity.notFound().build());
        return productRepository
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build()); */ //--->All of these are more efficient ways to do this
    }
//Get - Getting the resource
    //Post - Add new resource
    //Patch -  Update existing resource
    //Put - Replace existing resource
    //Delete - Delete a resource

    @PatchMapping("/products")
public Product updateProduct(@RequestBody Product product){
//Validate if product exists before doing save
        return  productRepository.save(product);
}

@DeleteMapping("/products/{id}")
public void delete (@PathVariable Long id){
        productRepository.deleteById(id);

    }
@GetMapping
    public ResponseEntity<?> searchByName(@RequestParam String name){
        return productRepository.findByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
