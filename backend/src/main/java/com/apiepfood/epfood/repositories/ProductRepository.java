package com.apiepfood.epfood.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiepfood.epfood.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAllByOrderByNameAsc(); //Query (busca) personalizada por ordem crescente (nome)
}
