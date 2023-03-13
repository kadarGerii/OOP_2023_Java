package oop.labor02.date;

import static oop.labor02.date.DateUtil.isValidDate;

public class MyDate {
    int year;
    int month;
    int day;
    public MyDate(int year, int month, int day){
        if(isValidDate(year, month, day)){
            this.year = year;
            this.month = month;
            this.day = day;
        }
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
}
