package ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // ++a exp value 11 a value 11
        //+
        //a++ exp value 11 a value 12
        //+
        //a++ exp value 12 a value is 13
    }
}
