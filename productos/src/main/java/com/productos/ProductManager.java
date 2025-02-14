package com.productos;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	private List<Product> products;
	
	/**
	 * Constructor de ProductManager
	 */
	public ProductManager(){
		List<Product> products = new ArrayList();
	}
	/**
	 * Método para añadir producto al productManager.
	 * @param p Un objeto de la clase Producto
	 * @throws Lanza una excepció si el nombre del producto es vacío, el precio es menor que 0 o ya existe en la lista.
	 */
	public void addProduct(Product p) {
		try {
			if(p.getProductName()==null || p.getProductName().trim().isEmpty()) {
				throw new IllegalArgumentException("El nombre no puede estar vacío");
			}
			if(p.getProductPrice()<0) {
				throw new IllegalArgumentException("El precio no puede ser negativo");
			}
			for(Product product:products) {
				if (p.getProductName()==product.getProductName()) {
					throw new IllegalArgumentException("El nombre del producto ya existe");
				}
			}
			this.products.add(p);
			System.out.println("Producto añadido con éxito");
		}catch (IllegalArgumentException e){	
			System.out.println("Error al añadir el producto");
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
