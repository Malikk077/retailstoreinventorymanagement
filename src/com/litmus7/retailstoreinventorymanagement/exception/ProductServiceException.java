package com.litmus7.retailstoreinventorymanagement.exception;

public class ProductServiceException extends  Exception{

   
    public ProductServiceException(String message) {
        super(message);
    }

   
    public ProductServiceException(String message, Throwable cause) {
        super(message, cause);
    }


}

