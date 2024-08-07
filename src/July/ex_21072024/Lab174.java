package July.ex_21072024;
//********
//*******
//******
//*****
//****
//***
//**
//*


public class Lab174 {
    public static void main(String[] args) {
        //i rows
        //j space
        //k no print
        for (int i = 8; i >= 1; i--) {
            for (int j =1; j <= 1; j++) {
                System.out.print("_");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
