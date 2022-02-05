package com.bilgeadam.productapp.service.impl;

import com.bilgeadam.productapp.entity.Product;
import com.bilgeadam.productapp.repository.ProductRepository;
import com.bilgeadam.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product creatProduct(Product product) {
        return productRepository.save(product);
    }


    public List<Product> updateProduct(Product product) {
        return productRepository.findAll();
    }


    public Product getproductById(long id) {
        return productRepository.getById(id);
    }


    public void deleteProduct(long id) {

        productRepository.deleteById(id);
    }
}
