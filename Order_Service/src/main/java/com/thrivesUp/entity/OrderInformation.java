package com.thrivesUp.entity;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//@Entity
public class OrderInformation {
	@Id
	private String emailId;
	 //@OneToMany
	private List<ProductDetails> productInfo;
	private double totalAmount;

	public OrderInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderInformation(String emailId, List<ProductDetails> productInfo, double totalAmount) {
		super();
		this.emailId = emailId;
		this.productInfo = productInfo;
		this.totalAmount = totalAmount;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<ProductDetails> getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(List<ProductDetails> productInfo) {
		this.productInfo = productInfo;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
