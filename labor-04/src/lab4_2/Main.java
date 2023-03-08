package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readFromCSVFile("Labor4_2_input.csv");
        for (BankAccount c:
             customers) {
            System.out.println(c);
        }
    }

    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList <Customer> customer = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String initial = items[0].trim();
                if(initial.equals("Customer")) {
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    customer.add(new Customer(firstName, lastName));
                }
                else{
                    String accNum = items[1].trim();
                    int balance = Integer.parseInt(items[2].trim());
                    customer.get(customer.size()-1).addAcount(new BankAccount(accNum, balance));
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customer;
    }
}
