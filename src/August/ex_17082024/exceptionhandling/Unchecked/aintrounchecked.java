package August.ex_17082024.exceptionhandling.Unchecked;
//jvm dont know
//rumtime exception>> (Runtime exception , arithmetich exception)
//
public class aintrounchecked {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = a/b;
        System.out.println(c);
    }
    //unchecked
    //about which jvm dont know about this error that by dividinng 0 /0 we have get infinit y so
    //jvm dont know the error and when we run we got the arithmetic error
    //which we are going to handle by try and catch

}
