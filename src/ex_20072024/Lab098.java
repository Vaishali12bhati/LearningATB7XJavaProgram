package ex_20072024;
//Number is even or odd
import java.util.Scanner;

public class Lab098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give me your now i will check it");
        int user_input = sc.nextInt();

        if (user_input%2==0){
            System.out.println("its an even number ");
    }else {
            System.out.println("its an odd number");
        }
        }
}
