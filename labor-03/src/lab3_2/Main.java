package lab3_2;

public class Main {
    public static void main(String[] args) {
        BankAccount otp = new BankAccount("OTP000");
        Customer customer1 = new Customer("Kadar", "Akos");
        /*for (int i = 0; i < 5; i++) {
            customer1.setAccount(new lab3_1.BankAccount[]);
            customer1.getAccount(otp+1);
        }*/
        Customer customer2 = new Customer("Kukta", "Norbert");
        System.out.println(customer1);
        System.out.println(customer2);

    }
}
