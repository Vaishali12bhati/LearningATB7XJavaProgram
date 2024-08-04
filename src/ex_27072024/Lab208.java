package ex_27072024;
//reverse a string without using reverse function
public class Lab208 {
    public static void main(String[] args) {
        String name = "abc";
        String name2 = "";

            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                name2 = ch + name2;
            }
            if (name.equals(name2)) {
                System.out.println("its a palindorme " + name2);
            } else {
                System.out.print("its not a palindrome but the reverse is " + name2);
            }
        }
    }
