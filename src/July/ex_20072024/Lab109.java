package July.ex_20072024;

import java.util.Scanner;

//which browser we have to test
public class Lab109 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the name of browser! where you want to execute");
        String browserName = s.next();
        browserName = browserName.toLowerCase();//we use this as the name may be in upper case so that we can cnvert it
        //into lower case
        switch (browserName) {
            case "chrome":
                System.out.println("let start the chrome browser");
                break;
            case "edge":
                System.out.println("let start the chrome browser");
                break;
            case "oracle":
                System.out.println("let start the chrome browser");
                break;
            default:
                System.out.println("currently we are not supporting this browser");
                break;
        }
    }

}



