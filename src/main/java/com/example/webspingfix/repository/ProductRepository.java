package com.example.webspingfix.repository;

import com.example.webspingfix.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProdName(final String prodName);

}
