package com.thrivesUp.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thrivesUp.entity.OrderInformation;
import com.thrivesUp.entity.ProductDetails;

@RestController
public class OrderController {

	@PostMapping("/create")
	public String createOrder(@RequestBody OrderInformation orderInformation) {

		System.out.println("Order creation request  for user" + orderInformation.getEmailId());

		// generate 8 random number
		return "Order Created, order referance" + UUID.randomUUID();
	}

	@GetMapping("/info/{orderId}")
	public OrderInformation getOrderInfo(@PathVariable String orderId) {
		System.out.println("orderId infromation for OrderId" + orderId);
		// check order id if presented not presented
		return new OrderInformation("saloni@123",
				List.of(new ProductDetails(1, "laptop", 578945), new ProductDetails(2, "Iphone", 5239)), 283792);

	}

	private void welcome() {

	}

}
