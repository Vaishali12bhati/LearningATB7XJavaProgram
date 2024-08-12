package August.ex_04082024.ex_04082024Constructor;

import java.util.Scanner;

public class Lab222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length ");
        double lenghth1 = sc.nextDouble();
        System.out.println("enter the width");
        double width1 = sc.nextDouble();

        Rectangle areas = new Rectangle(lenghth1,width1);
        areas.area_of_rectangle();


    }
}
