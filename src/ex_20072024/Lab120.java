package ex_20072024;

import java.util.Scanner;

//Create a program that determines whether a given year is a leap year. A leap year is divisible by 4,
// but not by 100 unless it is also divisible by 400. Use an if-else statement to make this determination.
public class Lab120 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year you want to check ");
        int year = s.nextInt();
        if ((year%4==0&& year%100!=0)||(year%400==0)) {
            System.out.println("its a leap year ");
        }
        else {
            System.out.println("its not a leap year");
        }
    }

}
