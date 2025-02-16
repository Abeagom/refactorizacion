package com.productos;

public class App 
{
    public static void main( String[] args ){
        ProductManager sp = new ProductManager();
        sp.addProduct(new Product("Monitor", 250));
        sp.addProduct(new Product ("Teclado", 50));
        sp.addProduct(new Product("Mouse", 25));
        sp.addProduct(new Product("Impresora", 150));
        sp.listProducts();
        sp.findProduct("Teclado");
        sp.findProduct("Scanner");
    }
}
