package August.ex_17082024.exceptionhandling.Unchecked;

public class Lab251NumberFormatException {
    public static void main(String[] args) {
        String num = args[0];
        int a = 0;//give the value of args in string so it cannot covert a string int so
        try {
            a = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("the value in args not define properly");
        }
        //giving error .NumberFormatException
        int b = a/34;
        System.out.println(b);
    }

}
