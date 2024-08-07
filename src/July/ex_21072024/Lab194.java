package July.ex_21072024;

import java.util.Scanner;
// wap to find the largest salry employee
//programs using swapping
public class Lab194 {
    public static void main(String[] args) {
        int swap = 0;
        int[] salary = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < salary.length; i++) {
            System.out.println("the salary of employee" + (i + 1));
            salary[i] = sc.nextInt();
        }
        for (int i = 0; i < salary.length; i++){
                for (int j = i + 1; j < salary.length; j++) {
                    if (salary[i] < salary[j]) {
                        swap = salary[i];
                        salary[i] = salary[j];
                        salary[j] = swap;
                    }
                }
            }
        System.out.println("high paid employe is" + salary[0]);
    }
    }





