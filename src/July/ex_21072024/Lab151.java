package July.ex_21072024;
//Factorial of no 5 = 5*4*3*2*1
import java.util.Scanner;

public class Lab151 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num = s.nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("the factorial is " + fact);
    }

    }

