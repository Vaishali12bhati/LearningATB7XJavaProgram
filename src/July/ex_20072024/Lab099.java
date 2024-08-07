package July.ex_20072024;
//if we take the input for the two number for even and odd
//it will work for only one
import java.util.Scanner;

public class Lab099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int user_input = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the number 2");
        int user_input2 = sc1.nextInt();

        if (user_input2% 2 == 0) {// as mention condition is for user_input2 we get the o/p for user2 only
            System.out.println("the no is even");
        } else {
            System.out.println("the  no is odd");
        }
    }
}
