package extra.models;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class Cousre {
    private String courseID;
    private int numberOfCredits;
    private Teacher teacher;
    private DayOfWeek dayOfCourse;
    ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Cousre(String courseID, int numberOfCredits, DayOfWeek dayOfCourse) {
        this.numberOfCredits = numberOfCredits;
        this.courseID = courseID;
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

    public Student searchStudentByNeptuneCode(String nepCode){
        for(Student s:enrolledStudents){
            if(s.getNeptunCode().equals(nepCode))
                return s;
        }
        return null;
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
    public void cancelEnrollmentStudent(String neptuneCode){
        for(Student s : enrolledStudents){
            if (s.getNeptunCode().equals(neptuneCode)){
                enrolledStudents.remove(s);
            }
        }
    }
    public String toString(){
        StringBuffer result = new StringBuffer();
        for(Student s : enrolledStudents){
            result.append("\t" + s);
        }
        return "Course: " + courseID + "\n\tTeacher: " + getTeacher() + "\n\tCredits: " + getNumberOfCredits()+"" +
                "\n\tOccours every: " + getDayOfCourse() + "\n\tEnrolled students: " + getNumberOfEnrolledStudents()+"" +
                "\n" + result;
    }
}
