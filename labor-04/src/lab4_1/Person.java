package lab4_1;

public class Person {
    String lastName;
    String firstName;
    int birthYear;

    public Person(String lastName, String firstName, int birthYear) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString(){
        return getFirstName() + " " + getLastName() + " " + getBirthYear();
    }
}
