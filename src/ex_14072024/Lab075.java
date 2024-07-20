package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        int p = 0;
        int q = p++ + p++ + ++p;
        System.out.println("p = " + p + ", q = " + q);
        //p , exp value 0 , p value 1
        //+
        // p, exp value  1 , p value 2
        //+
        //p, exp value 3 , p value 3
        //q = 0+1+3 =4
        //p = 3

    }
}
