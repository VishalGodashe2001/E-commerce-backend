package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Product;
import com.ictak.springsecurityclient.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).get();
    }
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Long productId, Product product) {

        Product deptDB = productRepository.findById(productId).get();

        if(Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())){
            deptDB.setProductName(product.getProductName());
        }
        if(Objects.nonNull(product.getProductPrice()) && !"".equalsIgnoreCase(product.getProductPrice().toString())){
            deptDB.setProductPrice(product.getProductPrice());
        }
        if(Objects.nonNull(product.getProductStock()) && !"".equalsIgnoreCase(product.getProductStock().toString())){
            deptDB.setProductStock(product.getProductStock());
        }
        return productRepository.save(deptDB);
    }

    @Override
    public String putProductById(Long productId) {
        return null;
    }


}
