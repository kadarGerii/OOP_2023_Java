package oop.labor11;

import oop.labor11.date.MyDate;
import oop.labor11.models.Company;
import oop.labor11.models.Employee;
import oop.labor11.models.Manager;
import oop.labor11.storage.Storage;

import java.util.Collections;
import java.util.List;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args){
        /*Company company1 = new Company("Habalabada");
        company1.hireAll("input.csv");
        company1.printAll(System.out);
        System.out.println("-----------------");
        company1.sortByComparator(Company.EmployeeComparator);
        company1.printAll(System.out);*/
        long start = System.currentTimeMillis();
        Storage s1 = new Storage("data1000000.txt");
        System.out.println(s1);
        System.out.println("----------------------------");
        s1.update("update1000000.txt");
        long end = System.currentTimeMillis();
        System.out.println(s1);
        long ellapsed = end-start;
        System.out.println("Time: " + ellapsed + "ms");
    }
}
