package com.litmus7.retailstoreinventorymanagement.dto;

abstract public class Product {
	private int productId;
	private String productName;
	private Double price;
	protected  PruductStatus status;
	public PruductStatus getStatus() {
		return status;
	}
	public void setStatus(PruductStatus status) {
		this.status = status;
	}
	private String productType;
	
	
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}	
}




