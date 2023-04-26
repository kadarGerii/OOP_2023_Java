package oop.labor08.accounts;

import oop.labor08.models.BankAccount;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    public CheckingAccount(double overdraftLimit){
        super();
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public boolean withdraw(double sum){
        if(super.getBalance() + this.overdraftLimit >= sum){
            balance -= sum;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\tOverdraft limit: " + this.getOverdraftLimit();
    }
}
