package oop.labor05.model;

import oop.labor02.date.MyDate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Training {
    private Course course;
    private double pricePerStudent;
    private MyDate startDate;
    private MyDate endDate;
    private static ArrayList<Student> students = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.pricePerStudent = pricePerStudent;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public boolean enrollStudent(Student student){
        students.add(student);
        return true;
    }
    public Student findStudentByID(Student student){
        for(Student s : students){
            if(s.getID().equals(student.getID()))
                return s;
        }
        return null;
    }

    public Course getCourse() {
        return course;
    }
    public int numEnrolled(){
        return students.size();
    }
    public void printToFile(){
        try {
            FileWriter myWriter = new FileWriter("courseName_startdate_enddate.csv");
            myWriter.write(getCourse().getName() + startDate + endDate);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Course: " + course +  "\n\tStart date: " + startDate +
                "\n\tEnd date: " + endDate + "\n\tStudents:\n" + students;
    }
}
