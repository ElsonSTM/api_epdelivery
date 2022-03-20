package com.apiepfood.epfood.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.apiepfood.epfood.entities.User;
import com.apiepfood.epfood.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception { // Rodar em tempo de execução
	
	User u1 = new User(null, "Ana Maria", "amaria@gmail.com", "93 9 9191-1421", "123456");
	User u2 = new User(null, "Elson Pinheiro", "engelp@gmail.com", "93 9 9191-2231", "123456"); 
	
	userRepository.saveAll(Arrays.asList(u1, u2));
	
	}
}
