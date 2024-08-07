package July.ex_20072024;

public class Lab106 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("1");
            // here we are not  closing the loop or curly braces
            if (false) { //when we have no closing loop so whenever we get the false, the execution stops there only
                System.out.println("2");

                if (true) {
                    System.out.println("3");
                }
            }
        }
    }
}