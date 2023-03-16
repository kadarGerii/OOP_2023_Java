package extra.models;

import extra.util.Major;

public class Student {
    private String neptunCode;
    private String firstName;
    private final String lastName;
    private Major major;

    public Student(String neptunCode, String firstName, String lastName, Major major) {
        this.neptunCode = neptunCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Major getMajor() {

        return this.major;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
    public String toString(){
        return "\t\t-" + getFirstName() + " " + getLastName() + " (" + getNeptunCode() + ")\n";
    }
}
