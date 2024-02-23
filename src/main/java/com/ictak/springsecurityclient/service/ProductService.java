package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    Product getProductById(Long productId);

    List<Product> getProducts();

    Product updateProduct(Long productId, Product product);

    String putProductById(Long productId);
}
