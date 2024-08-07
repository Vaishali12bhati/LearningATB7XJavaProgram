package July.ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();

        if (age<=18){
            System.out.println("eligible for vote");
        }else if (age>30) {
            System.out.println("eligible for 2 vote");
        }else {
            System.out.println("not eligible");
        }

    }
}
