package models;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class Cousre {
    private String courseID;
    private int numberOfCredits;
    private Teacher teacher;
    private DayOfWeek dayOfCourse;
    ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Cousre(Teacher teacher, int numberOfCredits, DayOfWeek dayOfCourse) {
        this.numberOfCredits = numberOfCredits;
        this.teacher = teacher;
        this.dayOfCourse = dayOfCourse;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public DayOfWeek getDayOfCourse() {
        return dayOfCourse;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public int getNumberOfEnrolledStudents(){
        return enrolledStudents.size();
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void enrollStudents(Student student){
        enrolledStudents.add(student);
    }
    public void cancelEnrollmentStudent(String name){
        for(Student s : enrolledStudents){
            if (s.getFirstName().equals(name)){
                enrolledStudents.remove(s);
            }
        }
    }
    public String toString(){
        return "Course: " + courseID + "\nTeacher: " + getTeacher() + "\nCredits: " + getNumberOfCredits()+"" +
                "\nOccours every: " + getDayOfCourse() + "\nEnrolled students: " + getNumberOfEnrolledStudents()+"" +
                "\n" + enrolledStudents;
    }
}
