package com.ecommerce.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.orders.entity.EcommerceOrder;

@Repository
public interface OrderRepository extends JpaRepository<EcommerceOrder, Integer>{

	
}
