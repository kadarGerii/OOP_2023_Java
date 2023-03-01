package lab3_2;

public class Main {
    public static void main(String[] args) {
        String otp = "OTP";
        Customer customer1 = new Customer("Kadar", "Akos");
        customer1.addNumAccounts(5);
        Customer customer2 = new Customer("Kukta", "Norbert");
        customer2.addNumAccounts(9);
        System.out.println(customer1);
        System.out.println(customer2);

    }
}
