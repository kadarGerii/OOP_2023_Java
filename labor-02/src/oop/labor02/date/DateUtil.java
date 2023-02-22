package oop.labor02.date;

public class DateUtil {
    public static boolean leapYear(int year){
        if(year % 4 == 0 || (year % 100 == 0 && year % 400 == 0))
            return true;
        return false;
    }
    public static boolean isValidDate(int year, int month, int day){
        if(year > 0){
            if(month > 0 && month <= 12){
                if(leapYear(year) && month == 2){
                    if(day > 0 && day <= 29)
                        return true;
                }
                else if(!leapYear(year) && month == 2){
                    if (day > 0 && day <= 28)
                        return true;
                }
                else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                    if(day <= 31 && day > 0){
                    return true;
                }
                else if(month != 2 && day > 0 && day <= 30)
                    return true;

            }
        }
        return false;
    }
}
