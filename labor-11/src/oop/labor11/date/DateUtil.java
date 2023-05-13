package oop.labor11.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static boolean leapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0) {
                if(year % 400 == 0)
                    return true;
                else return false;
            }
            else return true;
        }
        return false;
    }
    public static boolean isValidDate(int year, int month, int day){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        dateFormat.setLenient(false);
        String date = String.valueOf(year) + "/" + String.valueOf(month) + "/" + String.valueOf(day);
        try{
            Date javaDate = dateFormat.parse(date);
        }
        catch (ParseException e){
            return false;
        }
        return true;
    }
}
