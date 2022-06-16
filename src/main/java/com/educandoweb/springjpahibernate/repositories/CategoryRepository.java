package com.educandoweb.springjpahibernate.repositories;

import com.educandoweb.springjpahibernate.entities.Category;
import com.educandoweb.springjpahibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
