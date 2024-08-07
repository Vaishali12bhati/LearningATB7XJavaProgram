package July.ex_20072024;

import java.util.Scanner;

//take user input as a char and tell its vowel or not
public class Lab110 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the word");
        char VowelName= s.next().charAt(0);// this is different for char like how we sending the user input is diff for char
        System.out.println(VowelName);


        switch (VowelName){
                case 'a':
                System.out.println("hurray , its a vowel");
                break;
                case 'i':
                System.out.println("hurray , its a vowel");
                break;
                case 'e':
                System.out.println("hurray , its a vowel");
                break;
                case'u':
                System.out.println("hurray , its a vowel");
                break;
                case'o':
                System.out.println("hurray , its a vowel");
                break;
            default:
                System.out.println("its not a vowel you loose it");
                break;

        }

    }
}
