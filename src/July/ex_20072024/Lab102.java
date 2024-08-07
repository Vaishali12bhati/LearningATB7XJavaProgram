package July.ex_20072024;
import java.lang.Math;
//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) { //if we can use alone or with the multiple cond
            System.out.printf("your grade is A %d\n");
        } else if (marks >= 80 && marks <= 90) { // else if having multiple cond
            System.out.printf("your grade is B %d\n",marks);
        } else if (marks >= 70 && marks <= 79) {
            System.out.printf("your grade is C %d\n",marks);
        } else if (marks >= 60 && marks <= 69) {
            System.out.printf("your grade is D %d\n",marks);
        } else if (marks >= 40 && marks <= 59) {
            System.out.printf("your grade is E%d\n",marks);

        } else
            System.out.printf("you are fail%d\n",marks);
    }
    }
