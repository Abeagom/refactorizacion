package com.productos;

import java.util.Objects;

public class Product {
	private String productName;
	private double productPrice;
	
	/**
	 * Constructor de Producto
	 * @param productName El nombre del producto
	 * @param productPrice El precio del producto
	 * @throws IllegalArgumentException si el nombre está vacío o el precio es negativo
	 */
	public Product(String productName, double productPrice) {
		try {
			if(productName==null || productName.trim().isEmpty()) {
				throw new IllegalArgumentException("El nombre del producto no puede estar vacío");
			}
			if(productPrice<0) {
				throw new IllegalArgumentException("El precio no puede ser negativo");
			}
			this.productName=productName;
			this.productPrice=productPrice;
		}catch(IllegalArgumentException e) {
			System.out.println("El producto no ha podido crearse");
		}
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
	
	
	
	@Override
	public String toString() {
		return "ProductName=" + productName + ", ProductPrice=" + productPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productName);
	}

	/**
	 * @param Otro objeto
	 * @return Devuelve true si los objetos son el mismo y false si son distintos
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(productName, other.productName) & Objects.equals(productPrice, other.productPrice);
	}
	
}
