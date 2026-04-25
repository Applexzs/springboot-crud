package com.applexzs.springboot.app.repositories;

import com.applexzs.springboot.app.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}
