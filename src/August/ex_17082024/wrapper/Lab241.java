package August.ex_17082024.wrapper;

public class Lab241 {
    public static void main(String[] args) {
        String num = "10";
       // int a = (int)num;
        //not possible in the int primitive data type to convert a string to int
        //lets try with using the wrapper class
        Integer a = Integer.valueOf(num);
        //System.out.println(a);
        //by using function we are able to convert in wrapper class

        //STRING TO PRIMITIVE
        int a2 = Integer.parseInt(num);//parseint means to get the integer value only from the string
        System.out.println(a2);
        //hers it first converting to capita I Integer  Integer.parseInt(num);
        // and then to small i int (called unboxing)  int a2

  // we use this concept when
        //string to convert to int or Integer
        //primitive to wrapper or reverse



    }
}
