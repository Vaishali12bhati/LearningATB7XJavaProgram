package July.ex_21072024;

public class Lab145 {
    public static void main(String[] args) {
        for (int i =0;i<=100;i++) {
            if (i % 2 == 0) {
                System.out.println(i + " \n>> its an even number");
                break;
            }
            System.out.println(i + " \n>> its an odd number");
        }
    }
}

