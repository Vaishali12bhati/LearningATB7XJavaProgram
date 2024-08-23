package August.ex_17082024.exceptionhandling.Unchecked;

public class Lab250ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String num = null;
        try {
            num = args[1];
        } catch (Exception e) {
            System.out.println("check the args value");
        }
        //no define value for 1 length so giving error for ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(num);
        int b = a/0;
    }
}