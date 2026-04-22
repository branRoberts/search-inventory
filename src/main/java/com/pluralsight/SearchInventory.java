package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
        String file = "inventory.csv";
        String line;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                int id = Integer.parseInt(lineArray[0]);
                String name = lineArray[1];
                double price = Double.parseDouble(lineArray[2]);
                inventory.add(new Product(id, name, price));
            }

        }catch (Exception e){
            System.out.println("Error");
        }

        return inventory;
    }
}