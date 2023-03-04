package lab3_2;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    NumberFormat eFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public BankAccount(){
        this.accountNumber = null;
        this.balance = 0;
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
        return "Account number: " + getAccountNumber() + "\nBalance: " + eFormat.format(getBalance());
    }
}
