package oop.labor11.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Storage {
    private HashMap<Integer, Products> products = new HashMap<>();
    public Storage(String filename){
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String []items = scanner.nextLine().split(" ");
                int id = Integer.parseInt(items[0].trim());
                String name = items[1].trim();
                int amount =Integer.parseInt(items[2].trim());
                int price =Integer.parseInt(items[3].trim());
                products.put(id, new Products(id, name, amount, price));
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void update(String filename){
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String []items = scanner.nextLine().split(" ");
                Integer id = Integer.parseInt(items[0].trim());
                int newAmount = Integer.parseInt(items[1].trim());
                if(products.get(id) != null){
                    products.get(id).increaseAmount(newAmount);
                }
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString() {
        return "Storage{" +
                "products=" + products +
                '}';
    }
}
