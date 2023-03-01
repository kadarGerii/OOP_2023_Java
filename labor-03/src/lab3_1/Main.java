package lab3_1;

public class Main {
    public static void main(String[] args) {
       Customer customer1 = new Customer("John", "BLACK");
        //System.out.println(customer1.toString());
        //System.out.println(customer1);
        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1.toString());
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        System.out.println("\n");
        Customer customer2 = new Customer("Mary", "WHITE");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2.toString());
        customer2.getAccount().deposit(25000);
        customer2.getAccount().withdraw(400);
        System.out.println(customer2.toString());
        System.out.println("\n");
        double moneyMary = customer2.getAccount().getBalance();
        customer2.closeAccount();
        System.out.println(customer2.toString());

        customer2.setLastName(customer1.getLastName());
        customer2.setAccount(customer1.getAccount());
        customer1.getAccount().deposit(moneyMary);

        System.out.println(customer1.toString() + "\n");
        System.out.println(customer2.toString());
    }
}
