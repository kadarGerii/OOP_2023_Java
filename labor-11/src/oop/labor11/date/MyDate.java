package oop.labor11.date;


import java.util.Scanner;

import static oop.labor11.date.DateUtil.isValidDate;

public class MyDate implements Comparable<MyDate>{
    int year;
    int month;
    int day;
    public MyDate(int year, int month, int day){
        while(!isValidDate(year, month, day)){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Invalid! Try Another!(yyyy/MM/dd)");
            year = scanner.nextInt();
            month = scanner.nextInt();
            day = scanner.nextInt();
        }
            this.year = year;
            this.month = month;
            this.day = day;
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public String toString(){
        return year + "/" + month + "/" + day;
    }

    @Override
    public int compareTo(MyDate o) {
        if(this.year == o.year){
            if(this.month == o.month){
                return this.day - o.day;
            }
            return this.month - o.month;
        }
        return this.year - o.year;
    }
}
