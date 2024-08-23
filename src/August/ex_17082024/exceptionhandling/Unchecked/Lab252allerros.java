package August.ex_17082024.exceptionhandling.Unchecked;

public class Lab252allerros {
    public static void main(String[] args) {
        int b = 0;
        try {
            String num = args[0];
            int a = Integer.parseInt(num);
            b = 34/0;
        } catch (ArithmeticException|ArrayIndexOutOfBoundsException|NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
