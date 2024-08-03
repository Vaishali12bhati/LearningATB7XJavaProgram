package ex_21072024;

import java.util.Scanner;
import java.util.logging.SocketHandler;

//wap find maximum in a array o r max salary
public class Lab192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Salary = new int[5];
        {
            int max = 1;
            for (int i = 0; i < Salary.length; i++) {
                System.out.println("enter the salary of person" + (i + 1));
                Salary[i] = sc.nextInt();
                    if (Salary[i] > max) {
                        max = Salary[i];
                    }
                }
            System.out.println("the max salary is " +Salary[0]);
            }
        }
    }




//        System.out.println("enter the salary of vaishali");
//         Salary[0] = sc.nextInt();
//        System.out.println("enter the salary of manav");
//        Salary[1]= sc.nextInt();
//        System.out.println("enter the salary of poornima");
//        Salary[2]= sc.nextInt();
//        System.out.println("enter the salary of mahima");
//        Salary[3]= sc.nextInt();
//        System.out.println("enter the salary of jainy");
//        Salary[4]= sc.nextInt();
