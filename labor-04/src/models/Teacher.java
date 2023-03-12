package models;

import util.Degree;
import util.Department;

public class Teacher {
    private int ID = 0;
    private final String firstname;
    private String lastName;
    private Degree degree;
    private Department department;

    public Teacher(String firstname, String lastName, Degree degree, Department department) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.degree = degree;
        this.department = department;
    }
}
