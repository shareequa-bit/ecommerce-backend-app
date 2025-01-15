package com.ecommerce.orders.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EcommerceOrder {
	
	
	@Id
	private Integer id;
	private String orderId;
	private String orederdUserName;
	private Double totalAmount;
	private int items;
	
	

	
}
