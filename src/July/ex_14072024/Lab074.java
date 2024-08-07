package July.ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        int a = 7;
        int b = a++ + ++a + a++;
        System.out.println("a = " + a + ", b = " + b);
        // a , exp value 7 value of a 8
        //+
        //a, exp 9 , a value b 9
        //+
        //a exp 9 a value 10
        //b =7+9+9
    }
}
