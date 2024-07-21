package ex_20072024;

import java.util.Scanner;

//wap to write the weekdays
public class Lab108 {
    public static void main(String[] args) {
        //if else used for multicondition
        //we can use switch also instead of if else when we have the multiple condition
        //we have few rules too in using switch
        //switch is a multi way branch statement
        // 1 statement with multiple cond
        //exp in switch should ne byte short long int with its wrapper , enums and string
        //break can b use
        //switch should be in case
        //goin to use in test the browser
        Scanner s = new Scanner(System.in);
        System.out.println("enter the day from 1 to 7");
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; //it will end the execution when it matches the condition otherwise go last
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        {
            System.out.println("no idea of the day");
        }
    }
}
