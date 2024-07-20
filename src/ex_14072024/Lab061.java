package ex_14072024;

public class Lab061 {
    public static void main(String[] args) {
        byte a = 10;
        byte b  = 30;
        //byte c= b+v;
        int c = a+b;
        System.out.println(c);
        // byte + byte = int
        //char+ char = int
        char d='A';
        char e = 'B';
        System.out.println(d==65);
        System.out.println(e==69);
        //char g= d+e;
        int f = a+b;
        System.out.println(f);//in o/p its gives the value acc to ASCII value

        short g= 2;
        short h = 4;
        byte i = 4;
        //short +byte = int
        int j = g+h+i;
        //short +char = int
        int k= g+d;
        System.out.println(k);
        System.out.println(j);
        //int + int =int



        //int+long=long
        //byte +double =double
        //float+double= double
        //long +double = double


    }
}
