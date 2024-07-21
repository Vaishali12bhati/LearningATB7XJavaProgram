package ex_20072024;

import java.util.Scanner;

//wap to user input and tell vowel or not on the basis of new jdk update
public class Lab114 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the word");
        char VowelName = s.next().charAt(0);// this is different for char like how we sending the user input is diff for char
        System.out.println(VowelName);

        switch (VowelName) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("hurray , its a vowel");
                break;
            default:
                System.out.println("its not a vowel you loose it");
                break;
        }
    }
}
