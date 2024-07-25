package ex_21072024;

public class Lab161 {
    public static void main(String[] args) {
        // there are 4 types of function
        //type1.function without parameter and without return tupe
        //type2.without  parameter with return type
        //type3.with parameter without return type
        // type4.with prameter with return type
        type1();
        type2(); // in this its only give the o/p for the function 1 as for nd function the value is
        // not storing anywhere so for that we define it in a variabele
        //as there is no void parameter
        System.out.println("________________________________________________________________");
        String function_type = type2();
        System.out.println(function_type);// by this in the function_type we are storing the value of type2
// run and check the output
        System.out.println("________________________________________________________________");
        type3("amit");
        System.out.println("______________________________________________________________");
        int sum= type4(3,4);
        {
            System.out.println("the sum is "+ sum);
        }
    }

    //type1.function without parameter and without return tupe
    static void type1() {
        System.out.println("function without parameter and without return tupe ");
    }
    //type2.without  parameter with return type
    static String type2() {
        return "without  parameter with return type";
    }
    //type3.with parameter without return type
    static void type3(String name) {// name is the parameter
        System.out.println("the name of the boy is  " + name);
        System.out.println("with parameter without return type");//no return type is we using

    }
    // type4.with prameter with return type
    static int type4(int a, int b) {
        System.out.println("with prameter with return type");
        return a+b;

    }
}
