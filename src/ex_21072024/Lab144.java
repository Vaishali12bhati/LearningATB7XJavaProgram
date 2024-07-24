package ex_21072024;
//wap to print even and odd no bot using continue
public class Lab144 {
    public static void main(String[] args) {
      for (int i =0;i<=100;i++) {
          if (i % 2 == 0) {
              System.out.println(i + " \n>> its an even number");
              continue;
          }
          System.out.println(i + " \n>> its an odd number");
      }
      }
    }

