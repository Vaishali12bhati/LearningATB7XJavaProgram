package ex_20072024;
import java.lang.Math;


import java.util.Scanner;

//MAX NO IN TWO NUMBER
public class Lab100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();


        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the second number");
        int num2 = sc1.nextInt();

        if (num1 > num2) {
            System.out.printf("maximum number is%d", num1);
        } else if (num2>num1) {
            System.out.printf("maximum number%d", num2);
        }
        else{
               System.out.printf("numbers are same");
        }
        }
    }

