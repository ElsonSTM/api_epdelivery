package com.apiepfood.epfood.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apiepfood.epfood.dto.UserDto;
import com.apiepfood.epfood.entities.User;
import com.apiepfood.epfood.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true) //Garantir que a transação vai abrir e fechar conexão com o banco. ReadOnly não vai fazer o block de escrita no banco.
	public List<UserDto> findAll()  {
		List<User> list = repository.findAll(); //Chamada da query (busca) personalizada criado na classe OrderRepository
		return list.stream().map(x -> new UserDto(x)).collect(Collectors.toList());	
	}
	
	@Transactional(readOnly = true)
	public UserDto findById(Long id) {
		User entity = repository.findById(id).get();
		UserDto dto = new UserDto(entity);
		return dto;
	}

}
