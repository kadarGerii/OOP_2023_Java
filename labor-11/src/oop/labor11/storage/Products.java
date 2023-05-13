package oop.labor11.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Products {
    private int ID;
    private String name;
    private int amount;
    private int price;

    public Products(int ID, String name, int amount, int price) {
        this.ID = ID;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
    public void increaseAmount(int newAmount){
        this.amount += newAmount;
    }

    @Override
    public String toString() {
        return "Products{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price + "}\n";
    }

}
