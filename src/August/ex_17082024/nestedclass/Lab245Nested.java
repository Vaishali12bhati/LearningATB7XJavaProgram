package August.ex_17082024.nestedclass;
//we added the inner class for security
//created to hide the functionality
//we dont used them in automation
public class Lab245Nested {

}
class innerclass{
    int a = 19;
    void m1(){
        System.out.println("inner class function");
    }
    class outerclass{
        int b = 12;
        void m2 (){
            System.out.println(a);
            //outer class can use the variable and function of inner class but
            //vice versa is not possible
            //inner class cant call the variable or function of outer class

        }

    }

}
