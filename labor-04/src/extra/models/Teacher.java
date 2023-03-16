package extra.models;

import extra.util.Degree;
import extra.util.Department;

public class Teacher {
    private int ID;
    private final String firstname;
    private String lastName;
    private Degree degree;
    private Department department;
    private static int currentNumberOfTeachers = 0;

    public Teacher(String firstname, String lastName, Degree degree, Department department) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.degree = degree;
        this.department = department;
        this.ID = ++currentNumberOfTeachers;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getID() {
        return ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public Degree getDegree() {
        return this.degree;
    }

    public Department getDepartment() {
        return this.department;
    }

    public static int getCurrentNumberOfTeachers() {
        return currentNumberOfTeachers;
    }
    public String toString(){
        return getFirstname() + " " + getLastName() + " " + getDegree() + " from " + getDepartment();
    }
}
