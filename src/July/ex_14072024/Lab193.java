package July.ex_14072024;

import java.util.Scanner;

public class Lab193 {
    public static void main(String[] args) {
        float[] Salary = new float[4];//representing
        Scanner sc = new Scanner(System.in);
        {
            float min = 1;
            for (int i = 0; i < Salary.length; i++) {
                System.out.println("the salary of person" + (i + 1));
                Salary[i] = sc.nextFloat();
                if (Salary[i] < min)
                    min = Salary[i];
            }
            System.out.println("the min salary is " + min);

        }
    }
}
