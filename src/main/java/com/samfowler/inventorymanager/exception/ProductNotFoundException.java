package com.samfowler.inventorymanager.exception;

@SuppressWarnings("serial")
public class ProductNotFoundException extends RuntimeException {
	public ProductNotFoundException(Long id){
		super("Could not find Product with ID: " + id);
	}
}
