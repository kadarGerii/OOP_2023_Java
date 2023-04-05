package oop.labor08.models;

import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    public Bank(String name){
        this.name = name;
    }

    public Customer getCustomers(int customerID) {
        for (Customer c : customers){
            if (c.getId() == customerID){
                return c;
            }
        }
        return null;
    }
    public void addCustomer(Customer customer){
        if(customers.contains(customer)){
            return;
        }
        customers.add(customer);
    }
    public int numCustomers(){
        return customers.size();
    }
    private void printCustomers(PrintStream ps){
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ) {
            ps.println( customer.getId()+", " + customer.getFirstName() + ", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        ps.close();
    }
    public void printCustomersToStdout(){
        System.out.println(customers);
    }
    public void printCustomersToFile(String file){
        try {
            printCustomers( new PrintStream(file));
        } catch (Exception e) {
            e.printStackTrace();
        };
    }
}
