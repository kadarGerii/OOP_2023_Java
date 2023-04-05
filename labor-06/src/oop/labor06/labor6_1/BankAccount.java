package oop.labor06.labor6_1;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
    public static final String PREFIX = "OTP";
    public static int ACCOUNT_NUMBER_LENGTH = 10;
    private final String accountNumber;
    private static int numAccounts = 0;
    private double balance;
    NumberFormat eFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);

    public BankAccount(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        ++numAccounts;
    }
    public BankAccount(){
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }
    public String createAccountNumber(){
        return PREFIX + String.format("%7d", numAccounts);
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(){

        return this.balance;
    }
    public void deposit(double increase){
        if(increase >= 0){
            this.balance += increase;
        }
        else System.out.println("Invalid value! Try a positive value!");
    }
    public boolean withdraw(double decrease){
        if (decrease > this.balance || decrease == 0)
            return false;
        this.balance -= decrease;
        return true;
    }
    public String toString(){
        return "Account number: " + getAccountNumber() + "\n\tBalance: " + eFormat.format(getBalance());
    }
}
