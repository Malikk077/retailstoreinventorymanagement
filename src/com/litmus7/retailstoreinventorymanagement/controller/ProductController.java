package com.litmus7.retailstoreinventorymanagement.controller;

import java.util.List;

import com.litmus7.retailstoreinventorymanagement.dto.Product;
import com.litmus7.retailstoreinventorymanagement.dto.Response;
import com.litmus7.retailstoreinventorymanagement.service.ProductService;

public class ProductController {
	ProductService productService=new ProductService();
	
	public Response<Integer> addProduct(Product product){
		//check the return type and wrap a response to pass to client
		return new Response<>(200,"sample Response",0);
		}
	public Response<List<Product>> readAllProducts(){
		//check the return type and wrap a response to pass to client check if its null and respond accordingly
		List<Product> product =productService.readAllProducts();
		return new Response<>(200,"sample Response",product);
		}
	public Response<List<Product>> selectByCateogory(String productType){
		//check the return type and wrap a response to pass to client check if its null and respond accordingly
		List<Product> product =productService.selectByCateogory(productType);
		return new Response<>(200,"sample Response",product);
		}
	public Response<List<Product>> sortProduct(String sortingType){
		//check the return type and wrap a response to pass to client check if its null and respond accordingly
		List<Product> product =productService.sortProduct(sortingType);
		return new Response<>(200,"sample Response",product);
		}
	
	
	
	}





