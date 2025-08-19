package com.litmus7.retailstoreinventorymanagement.ui;

import java.util.List;

import com.litmus7.retailstoreinventorymanagement.controller.ProductController;
import com.litmus7.retailstoreinventorymanagement.dto.Product;
import com.litmus7.retailstoreinventorymanagement.dto.Response;

public class RetailStoreApp {

	public static void main(String[] args) {
		ProductController productController=new ProductController();
		// 1.Add Product to csv file 
		// Creating a object of any one of the cateogory  
		// adding its details using its getters and setters
		//calling the controller method for saving
		//create a response object for its return 
		Response<Integer> addProductResponse = productController.addProduct(null);//pass the product here 
		// print final results according to the data in the response 
		
		
		//2. View all products -( Retrieve all products from the Csv and display details)
		//create a response object 
		Response<List<Product>> viewAllResponse=productController.readAllProducts();
		//using viewAllResponse for presenting  the  product data accordingly 
		
		
		//3.view products by cateogory 
		//create a response object that calls the controler method while passing the desired product type as parameter
		Response<List<Product>> productCatogoryResponse=productController.selectByCateogory("productType");
		//using productCatogoryResponse for presenting  the  product data accordingly 
		
		
		//4.Sort Products - User can choose a sorting option:1.ascending 2.descending 3.by name 
		//pass the choice from the user as an argument while calling the controller function  sortProduct and store it in response object
		Response<List<Product>> sortProductResponse=productController.selectByCateogory(null);//comparator type
		////using sortProductResponse for presenting  the  product data accordingly
		
	}

}
