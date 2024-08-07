package July.ex_21072024;

import java.util.Arrays;
import java.util.Scanner;

//max min program using array.sort function
public class Lab198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Salary = new int[5];
        {
            for (int i = 0; i < Salary.length; i++) {
                System.out.println("enter the salary of person " + (i + 1));
                Salary[i] = sc.nextInt();
            }
            Arrays.sort(Salary);
            System.out.println("the max salary is " + Salary[4]);
            System.out.println("the min salay is" + Salary[0]);
        }

    }
}