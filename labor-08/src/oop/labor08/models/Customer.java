package oop.labor08.models;

import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private static int numCustomers = 0;
    private final int id;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++numCustomers;
    }

    public void addAcount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account:accounts) {
            if (accountNumber.equals(account.getAccountNumber()))
                return account;
        }
        return null;
    }

    public int getNumAccounts() {
        return this.accounts.size();
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void closeAccount(String accountNumber){
        for(BankAccount item:accounts){
            if(item.getAccountNumber().equals(accountNumber)){
                accounts.remove(accounts.indexOf(item));
                break;
            }
        }
    }

    public int getId() {
        return id;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(this.id +" " + this.firstName + " " + this.lastName + " accounts:\n");
        for(BankAccount a:accounts){
            result.append( "\t" + a +"\n");
        }
        return result.toString();
    }
}
