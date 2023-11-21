package com.example.jasper.jasper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jasper.jasper.model.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findAll();
}
