package August.ex_17082024.exceptionhandling.throw7throws;

import java.util.Scanner;

public class Lab259namevalidationthrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name ");
        String adminname = sc.next();
        if (!adminname.equalsIgnoreCase("vaisahli"))
        {
            try {
                throw new Exception("not admin");
            } catch (Exception e) {
                System.out.println("not valid username");
            }
        }else{
            System.out.println("you are welcome");
        }
    }
}