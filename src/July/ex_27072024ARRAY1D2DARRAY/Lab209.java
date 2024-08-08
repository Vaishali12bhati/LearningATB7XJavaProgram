package July.ex_27072024ARRAY1D2DARRAY;

import java.util.Scanner;

public class Lab209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word to check its palindrome or not");
        String name = sc.next();
        String name2 = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            name2 = ch + name2;
        }
        if (name.equals(name2)) {
            System.out.println("its a palindorme : " + name2);
        } else {
            System.out.print("its not a palindrome but the reverse is : " + name2);
        }
    }
}
