package lab4_2;

import java.util.ArrayList;

class Customer extends BankAccount {
    private final String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
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
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(BankAccount a:accounts){
            result.append( "\t" + a +"\n");
        }
        return result.toString();
    }
}
