package com.litmus7.retailstoreinventorymanagement.dao;


import java.util.List;

import com.litmus7.retailstoreinventorymanagement.dto.Product;
import com.litmus7.retailstoreinventorymanagement.exception.ProductDataAccessException;
import com.litmus7.retailstoreinventorymanagement.util.CsvUtil;

public class ProductDAO {
	public boolean saveProduct(Product product)throws ProductDataAccessException
	{
		//each of the product details is obtained using getters and setters
		//save_to_csv util method is called to store and return a boolean value 
		return true;
	}
	public List<Product> retriveAllProducts()throws ProductDataAccessException{
		List<Product> product=CsvUtil.readAllFromcsv();
		//read all line from the csv file into array List using ReadCsv File 
		return product;
	}
	
	

}
