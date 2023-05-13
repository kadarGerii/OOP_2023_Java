package oop.labor11.models;

import oop.labor11.date.MyDate;

public class Employee {
    private int ID;
    private final String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;
    private static int counter = 0;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.ID = counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getID() {
        return ID;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return ID + "\n" + firstName + " " + lastName + "\n" + birthDate + "\n" + salary+ "\n";
    }
}
