package oop.labor08;

import oop.labor08.accounts.CheckingAccount;
import oop.labor08.accounts.SavingsAccounts;
import oop.labor08.models.Bank;
import oop.labor08.models.BankAccount;
import oop.labor08.models.Customer;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("OTP");
        Customer customer1 = new Customer("Kadar", "Akos");
        Customer customer2 = new Customer("Kadar", "Csenge");
        bank1.addCustomer(customer1);
        bank1.addCustomer(customer2);
        customer1.addAcount(new SavingsAccounts(1.53));
        customer1.addAcount(new CheckingAccount(1000));
        customer1.getAccount("OTP0000001").deposit(12000);
        customer1.getAccount("OTP0000002").deposit(1000);
        System.out.println(customer1);
        customer2.addAcount(new SavingsAccounts(1.73));
        customer2.addAcount(new CheckingAccount(2000));
        customer2.getAccount("OTP0000003").deposit(12900);
        customer2.getAccount("OTP0000004").deposit(1500);
        System.out.println(customer2);

    }
}
