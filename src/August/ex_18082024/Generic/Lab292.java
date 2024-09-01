package August.ex_18082024.Generic;

public class Lab292 {
    public static void main(String[] args) {
        temp("hello");
        //temp(3);//doesnt support integaer
        temp(3);
        sum(9,7);
    }
    public static <T>  T sum (Integer a , Integer b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
    public static<T> void temp(T name){
     //t means any of datatype you can give it support
    }
}
