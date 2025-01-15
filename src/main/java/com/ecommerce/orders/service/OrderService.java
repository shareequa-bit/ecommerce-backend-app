package com.ecommerce.orders.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.orders.entity.EcommerceOrder;
import com.ecommerce.orders.exception.OrderException;
import com.ecommerce.orders.repository.OrderRepository;

@Service
public class OrderService {

	private OrderRepository orderRepository;
	
	OrderService(OrderRepository orderRepository){
		this.orderRepository=orderRepository;
	}
	
	public EcommerceOrder getOrder(Integer id) {
		Optional<EcommerceOrder> findById = orderRepository.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		else {
			throw new OrderException("order not found");
		}
	}

}
