package July.ex_21072024;
//function
//block of code which we can reuse
//usercreated/defined
//always have brackets in the end
//two components 1.define , 2.you have to call
//methods are used in diff classes and functions are define normal function we use in oops we discuss
public class Lab158 {
    public static void main(String[] args) {
//        int result = Math.max(6,5);
//        System.out.println(result);
        for (int i = 1;i<=5;i++) {
            greet();//calling the function
            greet2();
        }

    }

        static void greet()
        //static void greet() : we cannt  create same name function

        {//define function
        //void means no return
            System.out.println("hello how are you ");
        }
        static void greet2()
        {
            System.out.println("greet2");
        }

 }

