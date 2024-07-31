package ex_21072024;
//array define krte hai
//scanner krte for user input
//loop
//scaner value store
import java.util.Scanner;

//last program using for loop
public class Lab191 {
    public static void main(String[] args) {
        float[] mark = new float[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mark.length; i++) {
            System.out.println("enter the subject marks of " + (i + 1));
            mark[i] = sc.nextFloat();
        }

        float average = (mark[0] +mark[1] + mark[2] + mark[3] + mark[4] + mark[5]) / 6;
        System.out.println("yours avg is " + average);

        int j = 0;
        while (j < mark.length) {
            System.out.println(mark[j]);
            j++;
            {

            }


        }


    }
}