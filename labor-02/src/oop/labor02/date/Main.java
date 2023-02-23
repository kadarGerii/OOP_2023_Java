package oop.labor02.date;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*MyDate date1 = new MyDate(2003, 15, 10);
        if(DateUtil.isValidDate(date1.getYear(), date1.getMonth(), date1.getDay())){
            System.out.println(date1.toString());
        }
        else System.out.println("Error! Invalid date!");*/


        int invalidCounter = 0;
        Random random = new Random();
        MyDate [] date = new MyDate[1000];
        for (int i = 0; i < 1000; i++) {
            int y = random.nextInt(3000);
            int m = random.nextInt(12);
            int d = random.nextInt(31);
            date[i] = new MyDate(y, m, d);
            if(DateUtil.isValidDate(y, m, d))
                System.out.println(date[i].toString());
            else {
                invalidCounter++;
            }
        }
        System.out.println("Number of invalid dates generated: " + invalidCounter);

    }
}
