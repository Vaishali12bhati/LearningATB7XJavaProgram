package August.ex_17082024.exceptionhandling.Unchecked;
//we use the try and catch for the ignorethe error are below
public class Lab249errorhandling {
    public static void main(String[] args) {
        String ip = args[0];
        //String ip1 = args[1];
        //we got the error ".ArrayIndexOutOfBoundsException  "array bound exception we didnt give the value of index 1
// if we put the args value in a string than its give a error
        int a = Integer.parseInt(ip);//converting string to integer
        //error .ArrayIndexOutOfBoundsException
        int b = 0; // give .ArithmeticException
        try {
            b = 0/a;
        } catch (Exception e) {
            System.out.println("we cannnot divide by 0 its a fool try");
        } finally {
        }
        System.out.println(ip);
        System.out.println(b);
    }
}
