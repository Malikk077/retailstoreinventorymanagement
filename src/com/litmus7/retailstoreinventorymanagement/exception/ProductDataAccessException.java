package com.litmus7.retailstoreinventorymanagement.exception;

public class ProductDataAccessException extends  Exception{

   
    public ProductDataAccessException(String message) {
        super(message);
    }

   
    public ProductDataAccessException(String message, Throwable cause) {
        super(message, cause);
    }


}
