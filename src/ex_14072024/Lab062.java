package ex_14072024;

public class Lab062 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 200;
        int c=a; //implicit casting // sending the lower data type value to bigger one
        //byte d = byte(b);

        //System.out.println(d);

                //explicit casting // byte value is going to int data type
        // or we can write int c= int (a) known as explicit casting ,
        // when we define the data type its called explicit casting and
        // when we dont define the data type its called implicit casting
        // but no need to specify the data type  as its automatically done by JVM and on defining it grey out
        //process is known as widening
        //we cant to do this vise versa as sending int data type value to byte knows as Narrowing
        // byte c1 = b;
        //type casting : source and destination conversion
        //short bucket tarsfer to bigger basket (widening)(implicit and explicit)
        //larger bucket transfer to smaller basket which create loss to data (narrowing casting)
        //narrowing two type implicit and explicit
        System.out.println(c);

    }
}
