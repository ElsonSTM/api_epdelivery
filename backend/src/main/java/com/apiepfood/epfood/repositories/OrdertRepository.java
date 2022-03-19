package com.apiepfood.epfood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiepfood.epfood.entities.Order;

public interface OrdertRepository extends JpaRepository<Order, Long> {

}
