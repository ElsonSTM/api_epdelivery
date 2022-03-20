package com.apiepfood.epfood.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiepfood.epfood.dto.UserDto;
import com.apiepfood.epfood.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserDto>> findAll() {
		List<UserDto> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public UserDto findbById(@PathVariable Long id) {
		return service.findById(id);
	}
}
