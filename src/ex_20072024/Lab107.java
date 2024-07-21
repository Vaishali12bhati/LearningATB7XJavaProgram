package ex_20072024;

import java.util.Scanner;

//Triangle Classifier:
//
//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal), isosceles
// (exactly two sides are equal),
// or scalene (no sides are equal). Use an if-else statement to classify the triangle
public class Lab107 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the first side of triangle");
        int side1 = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("enter the second side of triangle");
        int side2 = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println("enter the third side of triangle");
        int side3 = s3.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Triangle is an equilatrol as all side are equal");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("triangle is issocles as two sides are same");
        } else {
            System.out.println("the triangle is scalene, all sides are different");

        }

    }
}




