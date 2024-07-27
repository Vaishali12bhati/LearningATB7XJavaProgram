package ex_21072024;
//            *
//           ***
//           *****
//           *******
//           *********

public class Lab173 {
    public static void main(String[] args) {
        //i =5, j= space , k
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}