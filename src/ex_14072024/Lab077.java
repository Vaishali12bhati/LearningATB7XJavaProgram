package ex_14072024;
//TWO WAYS TO CREATE STRING
//BY USING ASSIGNMENT OPERATOR
// BY USING METHOD NEW STRING
//how do they store value in jvm? is different
//By scp and heap
public class Lab077 {
    public static void main(String[] args) {
     String s ="VAISHALI"; //
        String s2 = new String("bhati");
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('V'));

    }
}
