package August.ex_17082024.exceptionhandling.Unchecked;

public class Lab250arithmeticexperror {
    public static void main(String[] args) {
        String num = args[0];//value is 0 passed
        int a = Integer.parseInt(num);
        int b = 0;
        try {
            b = 0/a;
        } catch (Exception e) {
            System.out.println("error in numbers");
        }
        //its giving error here so we are using try and catch method
        System.out.println("end of program");

    }
}
