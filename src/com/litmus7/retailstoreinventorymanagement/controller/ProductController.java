package com.litmus7.retailstoreinventorymanagement.controller;
import java.util.List;
import com.litmus7.retailstoreinventorymanagement.dto.Product;
import com.litmus7.retailstoreinventorymanagement.dto.Response;
import com.litmus7.retailstoreinventorymanagement.exception.ProductServiceException;
import com.litmus7.retailstoreinventorymanagement.service.ProductService;

public class ProductController {
	ProductService productService=new ProductService();
	
	public Response<Integer> addProduct(Product product){
		try
		{
			//check the return type and wrap a response to pass to client
			if (productService.addProduct(product))
			    return new Response<>(200,"sample Response",1);
			else
				return new Response<>(500,"sample Response",0);
		}catch(ProductServiceException e) {
			return new Response<>(500,"sample error");
		}	
	}
	
	public Response<List<Product>> readAllProducts(){
		//check the return type and wrap a response to pass to client check if its null and respond accordingly
		try
		{
			List<Product> product =productService.readAllProducts();
			return new Response<>(200,"sample Response",product);
		}catch(ProductServiceException e) {
			return new Response<>(500,"sample error");
		}
	}
	
	
	public Response<List<Product>> selectByCateogory(String productType){
		try{
			//check the return type and wrap a response to pass to client check if its null and respond accordingly
			List<Product> product =productService.selectByCateogory(productType);
			return new Response<>(200,"sample Response",product);
		}catch(ProductServiceException e) {
			return new Response<>(500,"sample error");
		}
		
	}
		
	public Response<List<Product>> sortProduct(String sorttype){
		try{
			//check the return type and wrap a response to pass to client check if its null and respond accordingly
			List<Product> product =productService.sortProduct(sorttype);
			return new Response<>(200,"sample Response",product);
		}catch(ProductServiceException e) {
			return new Response<>(500,"sample error");
		}		
	}
	
	
	
}





