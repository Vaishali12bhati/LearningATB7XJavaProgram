package ex_14072024;

public class Lab072 {
    public static void main(String[] args) {
        int i = 10;
        int a = i++ + ++i;
        System.out.println("i = " + i);
        System.out.println("a = " + a);
        // i value 10
        //10 exp i value 11
        //+
        //exp value 12 i value 12

        //a exp 10 a value 11
        //+
        //exp value 12 a value 12
    }
}
