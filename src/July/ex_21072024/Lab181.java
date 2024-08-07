package July.ex_21072024;

import java.util.Scanner;

//ARRAY
// HOW TO US AARAY
//DataType[] arrayName;
public class Lab181 {
    public static void main(String[] args) {
        int[] marks_10_borad = {20,100,40,34,34};
        //keyword new
        int[] marks = new int[7];
        //default value is 0 till the time we are not assigning value
        System.out.println(marks[4]);
        Scanner marking =new Scanner(System.in);
//        int input_marks = marking.nextInt();
        marks[0]= marking.nextInt();
        marks[1]= 53;
        marks[2]= 32;
        marks[3]= 33;
        marks[4]= 44;
        marks[5]= 46;
        marks[6]= 45;
        System.out.println(marks[6]);
        System.out.println(marks[4]);



    }
}
