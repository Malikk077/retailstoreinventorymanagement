package com.litmus7.retailstoreinventorymanagement.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.litmus7.retailstoreinventorymanagement.dto.Product;

public class Sorting {
	public static List<Product> sortingProduct(List<Product> product,String sortingType) {
		
		
		Comparator<Product> comparator;
		switch(sortingType.toLowerCase()) {
		case "ascending" :  comparator = (p1, p2) -> Double.compare(p1.getPrice(), p1.getPrice());
		                   break;
		case "descending ": comparator = (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice());
		                   break;
		case "name":   comparator = (p1, p2) -> p1.getProductName().compareTo(p2.getProductName());
		           break;
		 default:
		        throw new IllegalArgumentException("Invalid sorting type: " + sortingType);
		             }
		Collections.sort(product, comparator);
		return product;	
	}

}
