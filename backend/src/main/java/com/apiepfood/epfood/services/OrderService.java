package com.apiepfood.epfood.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apiepfood.epfood.dto.OrderDto;
import com.apiepfood.epfood.entities.Order;
import com.apiepfood.epfood.repositories.OrdertRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrdertRepository repository;

	@Transactional(readOnly = true) //Garantir que a transação vai abrir e fechar conexão com o banco. ReadOnly não vai fazer o block de escrita no banco.
	public List<OrderDto> findAll()  {
		List<Order> list = repository.findOrdersWithProducts(); //Chamada da query (busca) personalizada criado na classe OrderRepository
		return list.stream().map(x -> new OrderDto(x)).collect(Collectors.toList());
		
	}
}
