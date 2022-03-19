package com.apiepfood.epfood.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apiepfood.epfood.dto.ProductDto;
import com.apiepfood.epfood.entities.Product;
import com.apiepfood.epfood.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true) //Garantir que a transação vai abrir e fechar conexão com o banco. ReadOnly não vai fazer o block de escrita no banco.
	public List<ProductDto> findAll()  {
		List<Product> list = repository.findAllByOrderByNameAsc(); //Chamada da query (busca) personalizada
		return list.stream().map(x -> new ProductDto(x)).collect(Collectors.toList());
		
	}
}
