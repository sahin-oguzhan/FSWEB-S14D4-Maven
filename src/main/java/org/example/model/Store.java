package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Sweet", 22, "chocolate");
        products[1] = new Bread("Bakery", 12, "Bread");
        products[2] = new Coke("Drink", 50, "Coke");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            System.out.println(product.showDetails());
        }
    }

}
