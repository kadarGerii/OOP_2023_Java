package lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
        elements = new double[length];
    }

    public MyArray(double[] elements) {
        this.elements = elements;
        this.length = elements.length;
    }
    public MyArray(String file){
        try(Scanner scanner = new Scanner(new File(file))){
            double []actualElements = new double[0];
             int i = 0;
             while(scanner.hasNextLine()){
                 String line = scanner.nextLine();
                 if(line.isEmpty())
                     continue;
                 if(i == 0){
                     this.length = Integer.parseInt(line.trim());
                     actualElements = new double[this.length];
                     ++i;
                 }
                 else{
                     String []items = line.split(" ");
                     for (int j = 0; j < this.length; j++) {
                         actualElements[j] = Double.parseDouble(items[j].trim());
                     }
                 }
             }
             this.elements = actualElements;
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public MyArray(MyArray myarray){
        this.length = myarray.length;
        this.elements = myarray.elements;
    }
    public void fillRandom(double a, double b){
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            elements[i] = a + (b - a) * random.nextDouble();
        }
    }
    public double mean(){
        double sum = 0.0;
        for (double i : elements) {
            sum += i;
        }
        return (double)sum/length;
    }
    public void sort(){
        Arrays.sort(this.elements);
    }
    public void print(String name){
        for(double e:elements){
            System.out.printf("%.2f ", e);
        }
        System.out.println();
    }
    public double stddev(){
        if(length == 0)
            return Double.NaN;
        double sd= 0.0;
        for (double num : elements) {
            sd += Math.pow(num - mean(), 2);
        }

        return Math.sqrt(sd / length);

    }
}
