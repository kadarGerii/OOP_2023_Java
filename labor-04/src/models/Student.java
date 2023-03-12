package models;

import util.Major;

public class Student {
    private String neptunCode;
    private final String firstName;
    private String lastName;

    private Major major;

    public Student(String neptunCode, String firstName, String lastName) {
        this.neptunCode = neptunCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
