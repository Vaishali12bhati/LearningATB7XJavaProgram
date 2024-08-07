package July.ex_21072024;

public class Lab146 {
    public static void main(String[] args) {
        for (int i =10;i<=100;i=i+10) {//it will increment by 10
            if (i % 2 == 0) {
                System.out.println(i + " \n>> its an even number");
                continue;
            }
            System.out.println(i + " \n>> its an odd number");
        }
    }
}

