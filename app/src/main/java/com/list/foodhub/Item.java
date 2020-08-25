package com.list.foodhub;

import java.util.ArrayList;

public class Item {
    private String name;
    private String details;
    private int quantity;
    private String unit;

    public Item(String name, String details, int quantity, String unit) {
        this.name = name;
        this.details = details;
        this.quantity = quantity;
        this.unit = unit;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetails() { return details; }


    public static ArrayList<Item> createItemsList(int numItems) {
        ArrayList<Item> items = new ArrayList<Item>();

        for (int i = 1; i <= numItems; i++) {
            items.add(new Item("apples", "red delicious", 2, "kg"));
        }

        return items;
    }
}

