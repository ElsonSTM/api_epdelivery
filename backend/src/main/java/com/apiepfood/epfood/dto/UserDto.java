package com.apiepfood.epfood.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.apiepfood.epfood.entities.User;

public class UserDto {

	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	private List<OrderDto> orders = new ArrayList<>();
	
	public UserDto() {	
	}

	public UserDto(Long id, String name, String email, String phone, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	public UserDto(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		phone = entity.getPhone();
		password = entity.getPassword();
		orders = entity.getOrders().stream()
				.map(x -> new OrderDto(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<OrderDto> getOders() {
		return orders;
	}
			
}
