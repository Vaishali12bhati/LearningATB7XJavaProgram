package ex_21072024;

import java.util.Scanner;

public class Lab190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] mark = new float[5];
        System.out.println("enter the 1 subject marks");
        mark[0]= sc.nextFloat();
        System.out.println("enter the 2 subject marks");
        mark[1]= sc.nextFloat();
        System.out.println("3 subject mark");
        mark[2]= sc.nextFloat();
        System.out.println("4 subject mark");
        mark[3]= sc.nextFloat();
        System.out.println("5 subject marks");
        mark[4]=sc.nextFloat();
        float average = (mark[0]+mark[1]+mark[2]+mark[3]+mark[4])/5;
        System.out.println("yours avg is "+average);

    }
}
