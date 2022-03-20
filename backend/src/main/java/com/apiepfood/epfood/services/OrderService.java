package com.apiepfood.epfood.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apiepfood.epfood.dto.OrderDto;
import com.apiepfood.epfood.dto.ProductDto;
import com.apiepfood.epfood.entities.Order;
import com.apiepfood.epfood.entities.OrderStatus;
import com.apiepfood.epfood.entities.Product;
import com.apiepfood.epfood.repositories.OrdertRepository;
import com.apiepfood.epfood.repositories.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrdertRepository repository;
	
	@Autowired
	private ProductRepository productRepository;

	@Transactional(readOnly = true) //Garantir que a transação vai abrir e fechar conexão com o banco. ReadOnly não vai fazer o block de escrita no banco.
	public List<OrderDto> findAll()  {
		List<Order> list = repository.findOrdersWithProducts(); //Chamada da query (busca) personalizada criado na classe OrderRepository
		return list.stream().map(x -> new OrderDto(x)).collect(Collectors.toList());	
	}
	
	@Transactional(readOnly = true) //Garantir que a transação vai abrir e fechar conexão com o banco. ReadOnly não vai fazer o block de escrita no banco.
	public List<OrderDto> findDelivery()  {
		List<Order> list = repository.findOrdersDelivery(); //Chamada da query (busca) personalizada criado na classe OrderRepository
		return list.stream().map(x -> new OrderDto(x)).collect(Collectors.toList());	
	}
	
	@Transactional
	public OrderDto insert(OrderDto dto) { //OrderDTO vai ser o retorno ; OrderDTO dto vai ser o objeto a ser salvo no banco de dados
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), 
				Instant.now(), OrderStatus.EMPREPARACAO); //instancia dos objetos a serem salvo no banco de dados.
		for (ProductDto p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId()); //instanciar um produto, só que ele não vai no banco de dados, tudo gerenciado pelo JPA
			order.getProducts().add(product);
		}
		order = repository.save(order); //guarda uma referencia para o objeto salvo.
		return new OrderDto(order); //retornar o objeto order convertido para dto.
	}
	
	@Transactional
	public OrderDto setDelivered(Long id) {
		Order  order = repository.getOne(id);
		order.setStatus(OrderStatus.ENTREGUE);
		order = repository.save(order);
		return new OrderDto(order);
	}
}
