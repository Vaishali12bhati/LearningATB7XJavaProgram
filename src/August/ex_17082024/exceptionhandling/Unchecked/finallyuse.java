package August.ex_17082024.exceptionhandling.Unchecked;
//finally is a block of code which remain that if it doesnt give you error than the finally o/p will be post
public class finallyuse {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 24;
        int b = 6;
        int c = 0;
        try {
            c = a/b;
        } catch (Exception e) {
            System.out.println("cant devide by zero");
        } finally {
            System.out.println("if there will be no error or no error i will execute ");
        }
        System.out.println(c);
    }


}
