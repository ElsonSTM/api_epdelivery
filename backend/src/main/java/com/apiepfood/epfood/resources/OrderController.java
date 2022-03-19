package com.apiepfood.epfood.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiepfood.epfood.dto.OrderDto;
import com.apiepfood.epfood.dto.ProductDto;
import com.apiepfood.epfood.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<OrderDto>> findAll() {
		List<OrderDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
