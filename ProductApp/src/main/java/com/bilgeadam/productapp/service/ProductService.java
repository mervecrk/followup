package com.bilgeadam.productapp.service;

import com.bilgeadam.productapp.entity.Product;

import java.util.List;

public interface ProductService {

    Product creatProduct(Product product);
    List<Product> updateProduct(Product product);
    List<Product> getAllProducts;
    Product getproductById(long id);
    void deleteProduct(long id);




}
