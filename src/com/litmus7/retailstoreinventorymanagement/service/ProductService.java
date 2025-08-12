package com.litmus7.retailstoreinventorymanagement.service;

import java.util.List;

import com.litmus7.retailstoreinventorymanagement.dao.ProductDAO;
import com.litmus7.retailstoreinventorymanagement.dto.Product;
import com.litmus7.retailstoreinventorymanagement.util.Sorting;
import com.litmus7.retailstoreinventorymanagement.util.ValidationUtil;

public class ProductService {
	ProductDAO productDao=new ProductDAO();
	
	public boolean addProduct(Product product){
		//steps for validating the employee according to and return a boolean value as result
		//if valid then call dao method save
		if (ValidationUtil.validateProduct(product))
		    return productDao.saveProduct(product);
		else 
			return false;
	}
	
	public List<Product> readAllProducts(){
		return productDao.retriveAllProducts();
		//  returned product and return it to controller 
	}
	public List<Product> selectByCateogory(String productType){
		List<Product> product= productDao.retriveAllProducts();
		// retrieve all product from dao 
		// filter the  product list using the productType attribute
		// return the new refined List
		return product;		
	}
	public List<Product> sortProduct(String sortingType){
		List<Product> product= productDao.retriveAllProducts();
		// retrieve all product from dao 
		// sort the returned product using Switch case within the util funtion
		product=Sorting.sortingProduct(product,sortingType);
		// return the new refined List
		return product;		
	}
	
	

}
