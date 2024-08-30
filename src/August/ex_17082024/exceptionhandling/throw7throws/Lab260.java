package August.ex_17082024.exceptionhandling.throw7throws;

import java.util.Scanner;

public class Lab260 {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        Integer number  = sc.nextInt();
        int a = 0;
        try {
            a = number/0;
        } catch (Exception e) {
            System.out.println("only 0 can be use");
        }
        System.out.println(a);

    }
}
