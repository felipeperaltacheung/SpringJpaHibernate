package com.educandoweb.springjpahibernate.repositories;

import com.educandoweb.springjpahibernate.entities.OrderItem;
import com.educandoweb.springjpahibernate.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
