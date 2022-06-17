package com.educandoweb.springjpahibernate.repositories;

import com.educandoweb.springjpahibernate.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
