package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //file();
        ArrayList<Person> persons = readFromCSVFile("labor4_1_input.csv");
        for (Person p:
             persons) {
            System.out.println(p);
        }
    }
    public static void file(){
        int i = 1;
        try(Scanner scanner = new Scanner(new File("labor4_1_input.txt"))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(1 + " " + line);
                ++i;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
// trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
// Convert String → int: Integer.parseInt( String)
                int birthYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birthYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
