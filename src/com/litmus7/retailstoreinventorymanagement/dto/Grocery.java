package com.litmus7.retailstoreinventorymanagement.dto;
import java.util.Date;

public class Grocery extends Product{
	private Date expiryDate ; 
	private Double weightKg ;
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Double getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(Double weightKg) {
		this.weightKg = weightKg;
	}
	

}
