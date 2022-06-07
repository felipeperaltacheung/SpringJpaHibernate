package com.educandoweb.springjpahibernate.repositories;

import com.educandoweb.springjpahibernate.entities.Order;
import com.educandoweb.springjpahibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
