package extra;

import extra.models.Cousre;
import extra.models.Student;
import extra.models.Teacher;
import extra.util.Degree;
import extra.util.Department;
import extra.util.Major;
import lab4_1.Person;

import javax.lang.model.type.NullType;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Major major1 = new Major("Computer science");
        Student student1 = new Student("JK7WG7", "Akos", "Kadar", major1);
        Student student2 = new Student("FYEAS5", "David", "Kovacs", major1);
        Student student3 = new Student("HFV6UI", "Szabolcs", "Dezso", major1);
        Degree degree1 = new Degree("Chemistry teacher");
        Department department1 = new Department("Science department");
        Teacher teacher1 = new Teacher("Nagy", "G", degree1, department1);
        Cousre cousre1 = new Cousre("Chemistry I", 5, DayOfWeek.TUESDAY);
        cousre1.setTeacher(teacher1);
        cousre1.enrollStudents(student1);
        cousre1.enrollStudents(student2);
        cousre1.enrollStudents(student3);
        System.out.println(cousre1);
        ArrayList<Cousre> courses = new ArrayList<>();
        courses = readFromCSVFile("university.csv");
        for(Cousre c: courses){
            System.out.println(c);
        }
        System.out.println(Degree.getDegrees());

    }
    public static ArrayList<Cousre> readFromCSVFile(String fileName) {
        ArrayList<Cousre> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String courseID = items[0].trim();
                int numCredits = Integer.parseInt(items[1].trim());
                int day = Integer.parseInt(items[2].trim());
                DayOfWeek x;
                switch(day){
                    case 1:
                        x = DayOfWeek.MONDAY;
                        break;
                    case 2:
                        x = DayOfWeek.TUESDAY;
                        break;
                    case 3:
                        x = DayOfWeek.WEDNESDAY;
                        break;
                    case 4:
                        x = DayOfWeek.THURSDAY;
                        break;
                    case 5:
                        x = DayOfWeek.FRIDAY;
                        break;
                    case 6:
                        x = DayOfWeek.SATURDAY;
                        break;
                    case 7:
                        x = DayOfWeek.SUNDAY;
                        break;
                    default:
                        x = null;
                        break;
                }
                courses.add(new Cousre(courseID, numCredits, x));
                String line2 = scanner.nextLine();
                if (line2.isEmpty()) {
                    continue;
                }
                String []items2 = line2.split(",");
                String firstName = items2[0].trim();
                String lastName = items2[1].trim();
                String degree = items2[2].trim();
                String department = items2[3].trim();
                Degree degree1 = new Degree(degree);
                Department department1 = new Department(department);
                Teacher teacher = new Teacher(firstName, lastName, degree1, department1);
                courses.get(i++).setTeacher(teacher);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }
}
