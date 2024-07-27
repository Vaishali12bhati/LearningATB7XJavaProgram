package ex_21072024;
      // *
      //**
     //***
    //****
   //*****
  //******
 //*******
//********
public class Lab176 {
          public static void main(String[] args) {
              for (int i = 1; i <= 8; i++) {

                  for (int j =8 ; j >=i; j--)
                      //for (int j =8 ; j >=i; j--)
                  {
                      System.out.print(" ");
                  }

                  for (int k = 1; k <= i; k++) {
                      System.out.print("*");
                  }

                  System.out.println();
              }
          }
      }