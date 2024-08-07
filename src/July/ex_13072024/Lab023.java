//How byte b = 10 is stored in JVM?
package July.ex_13072024;

public class Lab023 {
    public static void main(String[] args) {
        byte b = 10;
        System.out.println(b);
        //ans
        //When the statement byte b = 10 is executed in Java, the JVM creates a variable named b of
        //type byte and assigns it the value 10.
        //the valu 10 is represented in binary format as 00001010 (since byte data type is
        //8 bits in size), and it is stored in memory as a sequence of 8 bits.
        // The JVM allocates a specific memory location for the variable b,
        // and the binary representation of the value 10 is stored at that memory location
    }
}
