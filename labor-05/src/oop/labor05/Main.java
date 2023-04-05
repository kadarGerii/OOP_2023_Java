package oop.labor05;
import oop.labor02.date.MyDate;
import oop.labor05.model.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("JavaSE17", "Java Standard Edition 17", 40);
        Student student1 = new Student("0001", "Akos", "Kadar");
        Student student2 = new Student("0002", "Szabolcs", "Dezso");
        MyDate start = new MyDate(2023, 3, 21);
        MyDate end = new MyDate(2023, 3, 25);
        Random random = new Random();
        double price = 1000 + (2000 - 1000) * random.nextDouble();
        Training training = new Training(course, start, end, price);
        training.addStudent(student1);
        training.addStudent(student2);
        System.out.println(training);
        ArrayList<Student> students = readStudents("students.csv");
        System.out.println(students.size());
        int i = 2;
        while(i < 10){
            int a = random.nextInt(students.size());
            if(!training.enrollStudent(students.get(a))){
                training.addStudent(students.get(a));
                i++;
            }
        }
        System.out.println("\n");
        System.out.println(training);
        training.printToFile();

    }
    private static ArrayList<Course> readCourses(String filename){
        ArrayList<Course> courses = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String name = items[0].trim();
                String description = items[1].trim();
                int hours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, description, hours));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return courses;
    }
    private static ArrayList<Student> readStudents(String filename){
        ArrayList<Student> students = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String id = items[0].trim();
                String lastName = items[1].trim();
                String firstName = items[2].trim();
                students.add(new Student(id, firstName, lastName));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return students;
    }
}
