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
				}
			}
			if(found) {
				System.out.println("Producto encontrado");
			}else {
				System.out.println("Producto no encontrado");
			}
		}catch(Exception e) {
		}
	}
	
	 /**public void addProduct(Product p) {
	     if (name == null || name.trim().isEmpty()) {
	         System.out.println("Error: Nombre inválido");
	         return;
	     }
	     if (price < 0) {
	         System.out.println("Error: Precio negativo");
	         return;
	     }
	     try {
	         if (productCount < productNames.length) {
	             productNames[productCount] = name;
	             productPrices[productCount] = price;
	             productCount++;
	             System.out.println("Producto agregado: " + name);
	         } else {
	             // Conversión improvisada de arrays a listas
	             System.out.println("Límite de array alcanzado. Convirtiendo a lista...");
	             java.util.List namesList = new java.util.ArrayList<>();
	             java.util.List pricesList = new java.util.ArrayList<>();
	             for (int i = 0; i < productCount; i++) {
	                 namesList.add(productNames[i]);
	                 pricesList.add(productPrices[i]);
	             }
	             namesList.add(name);
	             pricesList.add(price);
	             // Reconstruye los arrays a partir de la lista
	             productNames = new String[namesList.size()];
	             productPrices = new double[pricesList.size()];
	             for (int i = 0; i < namesList.size(); i++) {
	                 productNames[i] = namesList.get(i);
	                 productPrices[i] = pricesList.get(i);
	             }
	             productCount = namesList.size();
	             System.out.println("Producto agregado después de conversión: " + name);
	         }
	     } catch (Exception e) {
	         System.out.println("Error al agregar producto: " + e.getMessage());
	     }
	 }**/
	
	
}
