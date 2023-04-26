package oop.labor08.models;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
    public static final String PREFIX = "OTP";
    public static int ACCOUNT_NUMBER_LENGTH = 10;
    protected final String accountNumber;
    private static int numAccounts = 0;
    protected double balance;
    NumberFormat eFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);

    protected BankAccount(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        ++numAccounts;
    }
    protected BankAccount(){
        ++numAccounts;
        this.accountNumber = createAccountNumber();
        this.balance = 0;
    }
    public String createAccountNumber(){
        return PREFIX + String.format("%07d", numAccounts);
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
        return "Account number: " + getAccountNumber() + "\n\t\tBalance: " + eFormat.format(getBalance());
    }
}
