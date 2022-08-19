package com.lucasmedeiros.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasmedeiros.dscatalog.Entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}