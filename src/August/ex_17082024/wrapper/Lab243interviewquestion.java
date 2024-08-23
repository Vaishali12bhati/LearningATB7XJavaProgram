package August.ex_17082024.wrapper;

public class Lab243interviewquestion {
    public static void main(String[] args) {
        A a = new A();
        a.age = 43;
        A.m1();
        A.m2();
        //first it will call static bloc
        //on calling the object it will call iiv
        //then it call object op
        //directl we can call static



    }}

    class A{//creating class
        int age = 10;//creating int
        static  int discount = 100;
        //creating static block for class
        static {
            System.out.println("static block: static initialisation block");
        }
        {
            System.out.println("iib: instance initialisation block");//creating iib for the object
        }
        static void m1()
        {
         //   System.out.println(age);
            //non static cant be call under static
            System.out.println(discount);
            //static variable can be call under static
        }
        static void m2()
        {

        }
    }

