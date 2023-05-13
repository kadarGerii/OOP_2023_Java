package oop.labor11.models;

import oop.labor11.date.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Company {
    private String name;
    List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hire(Employee e){
        if (!employees.contains(e)){
            employees.add(e);
            System.out.println("Hired!");
        }
    }
    public void hireAll(String file){
        try(Scanner scanner = new Scanner(new File(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.equals("")) continue;
                String[] datas = line.split(",");
                String lastName = datas[0].trim();
                String firstName = datas[1].trim();
                double salary = Double.parseDouble(datas[2].trim());
                int year = Integer.parseInt(datas[3].trim());
                int month = Integer.parseInt(datas[4].trim());
                int day = Integer.parseInt(datas[5].trim());
                if (datas.length == 7){
                    String dep = datas[6].trim();
                    employees.add(new Manager(firstName, lastName, salary, new MyDate(year, month, day), dep));
                }
                else{
                    employees.add(new Employee(firstName, lastName, salary, new MyDate(year, month, day)));
                }
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    public void fire(int ID){
        for(Employee e : employees){
            if(e.getID() == ID){
                employees.remove(e);
                return;
            }
        }
    }
    public static Comparator<Employee> EmployeeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.getFirstName().equals(o2.getFirstName())){
                if(o1.getLastName().equals(o2.getLastName()))
                    return (int) (o2.getSalary() - o1.getSalary());
                return o1.getLastName().compareTo(o2.getLastName());
            }
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    };
    public void sortByComparator(Comparator<Employee> EmployeeComparator){
        employees.sort(EmployeeComparator);
    }
    public void printAll(PrintStream ps){
        for (Employee e : employees){
            ps.println(e);
        }
    }
    public void printManagers(PrintStream ps){
        for (Employee e : employees){
            if(e.getClass() == Manager.class){
                ps.println(e);
            }
        }
    }
}
