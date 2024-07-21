package ex_20072024;

import java.util.Scanner;

//wap to ask name details and salary
public class Lab117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = s.next();

        System.out.println("enter your age ");
        int age = s.nextInt();

        System.out.println("enter your salary ");
        double salary = s.nextDouble();

        System.out.printf("my name is %s", name);
        System.out.printf("\nmy age is %d", age);
        System.out.printf("\nmy salary is %f", salary);

        s.close();

;
    }
}
