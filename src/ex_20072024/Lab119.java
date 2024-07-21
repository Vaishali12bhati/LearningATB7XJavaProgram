package ex_20072024;

import java.util.Scanner;

//wap to check no is positive negative
public class Lab119 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int number = s.nextInt();

        if (number>=0)
        {System.out.println("the number is poitive ");
        } else if (number==0) {
            System.out.println("no is zero");
        }else {
            System.out.println("no is negative");
        }

        }

    }
