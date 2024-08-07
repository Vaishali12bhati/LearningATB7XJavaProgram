package July.ex_21072024;
//disadvantage of array
//fixed length(homogenous)
//fixed datatype
//wastage of memory
public class Lab187 {
    public static void main(String[] args) {
        final int[] age = new int[5];
        //final is for lenth
        //non primitive array
        age[4]= 90;
        System.out.println(age[4]);
    }
}
