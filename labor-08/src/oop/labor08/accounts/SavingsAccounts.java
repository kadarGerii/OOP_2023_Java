package oop.labor08.accounts;

import oop.labor08.models.BankAccount;

public class SavingsAccounts extends BankAccount {
    private double interestRate;
     public SavingsAccounts(double interestRate){
         super();
         this.interestRate = interestRate;
     }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void addInterest(){
         super.balance += super.balance * interestRate;
    }
    public String toString(){
         return super.toString() + "\n\t\tInterest rate: " + this.getInterestRate();
    }
}
