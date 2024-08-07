package July.ex_21072024;
//FIZZBUZZ PROBLEM
//Write a program that prints numbers from 1 to 100. However,
// for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz.
// " For numbers that are multiples of both 3 and 5, print "FizzBuzz."

import java.util.Scanner;

public class Lab153 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number ");
        int i = s.nextInt();
        for (int f=0;f<=100;f++){
            if (f%3==00&&f%5==0) {
                System.out.println(f+"\nfizzbuzz");
            } else if (f%5==0) {
                System.out.println(f + "\nbuz");
            } else if (f%3==0) {
                System.out.println(f + "\nfizz");

        }else
            {
                System.out.println(f+"\nnormal number");
            }
        }
        }
}

