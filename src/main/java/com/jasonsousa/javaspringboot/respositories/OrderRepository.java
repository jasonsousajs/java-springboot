package com.jasonsousa.javaspringboot.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasonsousa.javaspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
