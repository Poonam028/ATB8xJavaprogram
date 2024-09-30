package Task;

import java.util.Scanner;

public class task_2092024_LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = false;
        if((year%4==0 && year%100!=0) || year%400==0){
            isLeapYear =true;
        } if (isLeapYear=true){
            System.out.println( year + " is leap year");
    } else{
            System.out.println(year + "is not a leap year");
        }
    }
}