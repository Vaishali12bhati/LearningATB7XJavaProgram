package August.ex_17082024.exceptionhandling.exceptionpassing;
//unchecked exception handling
// .ArrayIndexOutOfBoundsException as the we are using op for 3 value
//in this we break the function and exception are passed from child to parent until the main function not found
public class Lab253 {
    public static void main(String[] args) {
        extracted();

    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer i [] = new Integer[2];
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println("unexpected expectation of user");
        }finally {
            System.out.println("end of the program");
        }
    }
}
