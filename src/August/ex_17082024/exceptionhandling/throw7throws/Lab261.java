package August.ex_17082024.exceptionhandling.throw7throws;

import java.util.Scanner;

public class Lab261 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        Integer num = sc.nextInt();
        try {
            if(num == 0){
                throw new ArithmeticException("we cant used 0 ");
            }
            int a = 10 /num;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("0 will not work");;
        }
    }
}
