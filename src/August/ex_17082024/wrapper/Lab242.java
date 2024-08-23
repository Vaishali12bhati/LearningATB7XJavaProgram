package August.ex_17082024.wrapper;

public class Lab242 {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(45);
        //yes its possible
        Double d = 3.14; //store in heap area
        double value = d.doubleValue();//store in continios area (primitive)
        System.out.println(d);
        String s1 = "vaishali";//store in the scp
        String s2 = new String("vaihsali");//stored in heap area

    }
}
