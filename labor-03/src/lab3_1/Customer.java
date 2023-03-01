package lab3_1;

class Customer extends BankAccount {
    private final String firstName;
    private String lastName;
    private BankAccount account;
    public Customer(String accountNumber ,String firstName, String lastName) {
        super(accountNumber);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
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
    public void closeAccount(){
        this.account = null;
    }
    public String toString(){
        return "Name: " + getFirstName() + " " + getLastName() + "\n" + getAccount();
    }
}
