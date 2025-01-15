package com.ecommerce.orders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.orders.entity.EcommerceOrder;
import com.ecommerce.orders.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	private OrderService orderService;
	
	 public OrderController(OrderService orderService) {
		this.orderService =orderService;
	}
	
	@GetMapping("/getOrder/{id}")
	public EcommerceOrder getOrder(@PathVariable("id") Integer id) {
		System.out.println("getting an order of id" +id);
		//return new EcommerceOrder(101, "Order1111","shareequa", 2000.0, 2);
		return orderService.getOrder(id);
	}

}
