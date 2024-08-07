package July.ex_21072024;
//minimum second salary employe
import java.util.Scanner;

public class Lab196 {
    public static void main(String[] args) {
        int[] salary = new int[4];
        Scanner sc = new Scanner(System.in);
        int temp;
        for (int i = 0; i < salary.length; i++) {
            System.out.println("the salary of employe " + (i + 1));
            salary[i] = sc.nextInt();
        }
        for (int i = 0; i < salary.length; i++) {
            for (int j = i + 1; j < salary.length; j++) {
                if (salary[i] > salary[j]) {
                    temp = salary[i];
                    salary[i] = salary[j];
                    salary[j] = temp;
                }
            }
        }
        System.out.println("the less paid employees salary is "+salary[1]);

            }

        }


