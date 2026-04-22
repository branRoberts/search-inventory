package com.pluralsight;

import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        // Write your code here
//        inventory.add(new Product(1, "Apple", 100));
//        inventory.add(new Product(2, "Banana", 200));
//        inventory.add(new Product(3, "Cheese", 300));
//        inventory.add(new Product(4, "Coffee", 400));
//        inventory.add(new Product(5, "Cup", 500));


        return inventory;
    }
}