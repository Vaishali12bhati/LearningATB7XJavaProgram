package August.ex_17082024.wrapper;

public class Lab240 {
    public static void main(String[] args) {


        //convert primitive to wrapper class
        int a = 10;
        Integer b = a;
        System.out.println(a);
        System.out.println(b);

        //conver wrapper class to primitive
        Integer a1 = 34;//autoboxing : int is always converting to Integer automatically
        int b1 = a1;//unboxing >> when converting Integer to int as removing the wrapper of the class

        System.out.println(a1);
        System.out.println(b1);

    }
}
