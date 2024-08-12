package August.ex_04082024.ex_04082024Constructor;

import java.util.Scanner;

public class Lab220bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bank name");
        String names = sc.next();
        System.out.println("enter your balance");
        int amt = sc.nextInt();
        System.out.println("enter the ifsc code ");
        String ifsc = sc.next();
        Bank B = new Bank();
        Bank sbi = new Bank(names,amt,ifsc);
        sbi.printdetails();






    }
}
