package com.productos;

public class Product {
	private String productName;
	private double productPrice;
	
	/**
	 * Constructor de Producto
	 * @param productName El nombre del producto
	 * @param productPrice El precio del producto
	 */
	public Product(String productName, double productPrice) {
		this.productName=productName;
		this.productPrice=productPrice;
	}
	
	//Getters and setters

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	

}
