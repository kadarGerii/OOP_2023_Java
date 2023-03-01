package lab3_2;

import lab3_1.BankAccount;

class Customer extends BankAccount {
    private final String firstName;
    private String lastName;
    public static final int MAX_ACCUNTS = 10;
    private BankAccount[] accounts = new BankAccount[MAX_ACCUNTS];

    private int numAccounts;
    public Customer(String accountNumber , String firstName, String lastName) {
        super(accountNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.numAccounts = 0;
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.numAccounts = 0;
    }

    public void setAccount(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account:accounts) {
            if (accountNumber.equals(account.getAccountNumber()))
                return account;
        }
        return null;
    }

    public int getNumAccounts() {
        return this.numAccounts;
    }
    void addNumAccounts(int numAccounts){
        this.numAccounts = numAccounts;
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
        for (BankAccount account:accounts) {
            if (accountNumber.equals(account.getAccountNumber()))
                account = null;
        }
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i] +"\n");
        }
        return result.toString();
    }
}
