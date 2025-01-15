package com.ecommerce.orders.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		//System.out.println("getting an order of id " +id);
		//return new EcommerceOrder(101, "Order1111","shareequa", 2000.0, 2);
		return orderService.getOrder(id);
	}
	
	@GetMapping("")
	public List<EcommerceOrder> getOrders() {
	   
		List<EcommerceOrder> list=new ArrayList<>();
		list.add(new EcommerceOrder( 101, "Order1111","shareequa", 2000.0, 2));
		list.add(new EcommerceOrder( 102, "Order1112","shareequa", 1000.0, 1));
		list.add(new EcommerceOrder( 103, "Order1113","shareequa", 5000.0, 3));
		return list;
	}

}
