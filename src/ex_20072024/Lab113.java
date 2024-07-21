package ex_20072024;

import java.util.Scanner;

//JDK UPDATE FOR OVER 13 THAN WE CAN USE MULTIPLE CONDITION
public class Lab113 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the product no from 001 to 006");
        int itemcode = s.nextInt();
        switch (itemcode){
            case 1,2,3:
                System.out.println("electrical product");
                break;
            case 004,005,006:
                System.out.println("mechanical product");
                break;
            default:
                System.out.println("currently we dont have info");
                break;
        }
    }
}
