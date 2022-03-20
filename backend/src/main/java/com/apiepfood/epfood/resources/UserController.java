package com.apiepfood.epfood.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiepfood.epfood.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Elson", "engelp@gmail.com", "93 9 9191-2234", "123456");
		return ResponseEntity.ok().body(u);
	}
}
