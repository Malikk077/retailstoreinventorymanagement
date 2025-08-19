package com.litmus7.retailstoreinventorymanagement.service;
import java.util.Comparator;
import java.util.List;
import com.litmus7.retailstoreinventorymanagement.dao.ProductDAO;
import com.litmus7.retailstoreinventorymanagement.dto.Product;
import com.litmus7.retailstoreinventorymanagement.exception.ProductDataAccessException;
import com.litmus7.retailstoreinventorymanagement.exception.ProductServiceException;
import com.litmus7.retailstoreinventorymanagement.util.ValidationUtil;

public class ProductService {
	ProductDAO productDao=new ProductDAO();
	
	public boolean addProduct(Product product)throws ProductServiceException{
		try{//steps for validating the employee according to and return a boolean value as result
		//check if product with product id already exist if exist  then  return false
		if (ValidationUtil.validateProduct(product))
		    return productDao.saveProduct(product);
		else 
			return false;
		}catch(ProductDataAccessException e) {
			//handle by throwning ProductServiceException
		}
		return false;
	}
	
	public List<Product> readAllProducts()throws ProductServiceException{
		try{
			return productDao.retriveAllProducts();
		     //  returned product and return it to controller 
		}catch(ProductDataAccessException e) {
			//handle by throwning ProductServiceException
		}
		return null;
	}
	
	
	public List<Product> selectByCateogory(String productType)throws ProductServiceException{
		try{
			List<Product> product= productDao.retriveAllProducts();
			// retrieve all product from dao 
			// filter the  product list using the productType attribute
			// return the new refined List
			return product;
		}catch(ProductDataAccessException e) {
			//handle by throwning ProductServiceException
		}
		return null;			
	}
	
	public List<Product> sortProduct(Comparator<Product> comparator)throws ProductServiceException{
		try{
			List<Product> product= productDao.retriveAllProducts();
			// retrieve all product from dao 
			// sort the returned product using Switch case within the util funtion
			product.sort(comparator);
			// return the new refined List
			return product;	
		}catch(ProductDataAccessException e) {
			//handle by throwning ProductServiceException
		}
		return null;		
	}
	
	

}
