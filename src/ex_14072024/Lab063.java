package ex_14072024;

public class Lab063 {
    public static void main(String[] args) {
        long phone_no = 7838383893l;
        //short s = phone_no;
        short s= (short) phone_no; // narrowing as we putting large value in the samll container , so its taking the
        //value only taht much it can store other is going to garbasge
        System.out.println(s);
    }
}
