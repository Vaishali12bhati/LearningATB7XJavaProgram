package ex_14072024;

public class Lab087 {
    public static void main(String[] args) {
        String s1 = "vaishali";
        String s2 = "bhati";
        char c  = s1.charAt(5);
        System.out.println(c);
        s1= s1.concat("tester");
        System.out.println(s1);
       String s3= s1.concat(s2);//showing the updating value of s1
        System.out.println(s3);


    }
}
