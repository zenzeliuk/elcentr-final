package com.elcentr.dao;

import com.elcentr.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

    Product findByCode(String code);

}
