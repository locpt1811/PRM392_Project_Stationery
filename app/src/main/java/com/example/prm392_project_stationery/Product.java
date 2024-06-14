package com.example.prm392_project_stationery;

public class Product {
    private String name;
    private double price;
    // Add other product attributes as needed
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
