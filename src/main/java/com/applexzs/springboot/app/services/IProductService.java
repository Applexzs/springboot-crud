package com.applexzs.springboot.app.services;

import com.applexzs.springboot.app.entities.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    Optional<Product> update(Long id, Product product);

    Optional<Product> delete(Long id);
}
