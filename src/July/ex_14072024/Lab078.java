package July.ex_14072024;
//scp //heap
public class Lab078 {
    public static void main(String[] args) {

        // the strings created by using the assignmnet operator = are stored in scp
        //SCP : STRING CONSTANT POOL
        //if we update the value of s1 than the older one remain in the pool but the s1 is now
        //pointed to the updated value
        String s1 = "pramod";
        //1 string
        s1= "amit";
        //2 string and update
        s1= "vaishali";
        //3 string
        s1 = "pramod";
        //it will take above one and only 3 strings are there

    }
}
