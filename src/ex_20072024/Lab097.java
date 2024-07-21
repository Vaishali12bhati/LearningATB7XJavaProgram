package ex_20072024;

import java.util.Scanner;

// USE OF SCANNER CLASS AND NEXTIN()
public class Lab097 {
    public static void main(String[] args) {
        //take a user input and check even odd
        //logic building
        //1. figure out the inputs : how to take inputs in java
        //tHERE IS PREBUILT CLASS IN JAVA "SCANNER CLASS"
        //NEXTIN() >> INPUT
        //2.figure out the data type : data type
        //3.do we need conversion
        //4.write logic
        //optimise
        Scanner sc = new Scanner(System.in);// helps you get the user input
        System.out.println("enter the num ");//the output will automatically assign to user_input
        int user_input = sc.nextInt(); //what will the user will enter
        System.out.println(user_input);

        if (user_input%2==0) {
            System.out.println("its an even number");
        }else {

            System.out.println("its an odd ");
        }

        }

    }

