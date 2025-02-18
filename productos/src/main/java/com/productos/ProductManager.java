package com.productos;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	private List<Product> products;
	
	/**
	 * Constructor de ProductManager
	 */
	public ProductManager(){
		this.products = new ArrayList();
	}
	/**
	 * Método para añadir producto al productManager.
	 * @param p Un objeto de la clase Producto
	 * @throws Lanza una excepción si existe otro producto con el mismo nombre
	 */
	public void addProduct(Product p) {
		try {
			for(Product product:products) {
				if (p.getProductName().equalsIgnoreCase(product.getProductName())) {
					throw new IllegalArgumentException("El nombre del producto ya existe");
				}
			}
			this.products.add(p);
			System.out.println("Producto añadido con éxito");
		}catch (IllegalArgumentException e){	
			System.out.println("Error al añadir el producto. Ya existe.");
		}
	}
	
	/**
	 * Lista los productos de la lista
	 * @throws Exception si la lista está vacía
	 */
	public void listProducts() {
		try {
			if(products.isEmpty()) {
				throw new Exception("La lista está vacía");
			}
			System.out.println("Lista de productos:");
			for (Product p:products) {
				System.out.println(p);
			}
		}catch(Exception e) {
		}
	}
	
	/**
	 * Busca un producto en la lista
	 * @param productName
	 * @throws Lanza una excepción si la lista está vacía
	 */
	public void findProduct(String productName) {
		try {
			if(products.isEmpty()) {
				throw new Exception("La lista está vacía");
			}
			boolean found = false;
			for(Product p:products) {
				if(p.getProductName().equalsIgnoreCase(productName)) {
					found=true;
					System.out.println("Productos encontrados: \n" + p);
				}
			}
			if(!found) {
				System.out.println("Producto no encontrado: " + productName);
			}
		}catch(Exception e) {
		}
	}
}
