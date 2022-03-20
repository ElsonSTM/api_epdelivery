package com.apiepfood.epfood.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.apiepfood.epfood.entities.Order;

public interface OrdertRepository extends JpaRepository<Order, Long> {

	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
			+ "WHERE obj.status = 0 ORDER BY obj.moment ASC") 
	List<Order> findOrdersWithProducts(); //Query (busca) personalizada para listar os pedidos pendentes e ordenados do mais antigo para o mais recente.
	
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
			+ "WHERE obj.status = 2 ORDER BY obj.moment ASC") 
	List<Order> findOrdersDelivery(); //Query (busca) personalizada para listar os pedidos pendentes e ordenados do mais antigo para o mais recente.
}
