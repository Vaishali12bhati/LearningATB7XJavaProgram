package July.ex_14072024;

public class Lab080 {
    public static void main(String[] args) {
        String s1 = "VAISHALI";
        String s2 = s1;
        //1 string in heap
        System.out.println(s1);
        String s3 = s2.toLowerCase();//after this we have 2 strings one VAISHALI and 2 is vaishali
        System.out.println(s3);
        System.out.println(s2);
    }
}
