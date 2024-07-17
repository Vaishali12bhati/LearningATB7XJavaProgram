package ex_13072024;
//concatination and append
public class Lab035 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        String S1 = "Vaishali";
                String S2 = "bhati";
        System.out.println(S1+" "+S2); // CALLED concatination

        // now for appened we took 1 int and 1 string , so when we connect 1 int nd 1 int its make it append below example

        String S3 = "is a tester ";
        System.out.println(a+S1+b+""+S2+S3); //this is appending
        System.out.println(S1+""+a+""+b+""+S2+""+S3);
        System.out.println(a+b+S3+b+S3+a+b);

    }
}
