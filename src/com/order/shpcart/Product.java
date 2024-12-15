package com.order.shpcart;
import java.io.Serializable;

//POJO[Plain Old Java Object] Java Bean

public class Product implements Serializable {
	
	private int productId;
	private String productName;
	private double unitPrice;
	private int qtyOnHand;
	private String category;
	private String description;
	
	//No-argument constructor
	public Product(){ }

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQtyOnHand() {
		return qtyOnHand;
	}

	public void setQtyOnHand(int qtyOnHand) {
		this.qtyOnHand = qtyOnHand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "[productId=" + productId + ", productName=" + productName + ", unitPrice=" + unitPrice
				+ ", qtyOnHand=" + qtyOnHand + ", category=" + category + ", description=" + description + "]";
	}
	
}
