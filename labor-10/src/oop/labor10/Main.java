package oop.labor10;

import oop.labor10.models.*;

public class Main {
    public static void main(String[] args) {
        Aramkor aramkor = new Aramkor();
        Alkatresz alk1 = new Kondenzator(123, 12.5);
        Alkatresz alk2 = new Kondenzator(23, 13.5);
        Alkatresz alk3 = new Tranzisztor(3, "asdfgh");
        Alkatresz alk4 = new Tranzisztor(13, "as23gh");
        Alkatresz alk5 = new Ellenallas(20, 10);
        Alkatresz alk6 = new Ellenallas(24, 21);
        aramkor.hozzaad(alk1);
        aramkor.hozzaad(alk2);
        aramkor.hozzaad(alk3);
        aramkor.hozzaad(alk4);
        aramkor.hozzaad(alk5);
        aramkor.hozzaad(alk6);
        System.out.println(aramkor);
        aramkor.torol(alk1);
        aramkor.torol(alk2);
        System.out.println(aramkor);
        System.out.println("Ossz ar: " + aramkor.osszAr());
        System.out.println("Eredo ellenallas (csak ellenallasok eseten): "+aramkor.eredoEllenallas());
    }
}
