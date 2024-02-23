package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.Product;
import com.ictak.springsecurityclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {  

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Product saveProducts(@RequestBody Product product){
        //  LOGGER.info("Inside saveProduct of ProductController");
        return productService.saveProduct(product);
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long productId){
        return productService.getProductById(productId);
    }
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable("id") Long productId){
        return productService.putProductById(productId);
    }    
}
