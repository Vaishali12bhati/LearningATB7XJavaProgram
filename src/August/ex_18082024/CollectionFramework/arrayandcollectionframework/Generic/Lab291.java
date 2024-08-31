package August.ex_18082024.CollectionFramework.arrayandcollectionframework.Generic;

import java.util.ArrayList;
import java.util.List;

//generic means allow the reusability of code
//rarely used
public class Lab291 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add("tt");
        mylist.add(56);
        mylist.add("generic");

        //basically create a function generic in nature
        List <Integer> waitlist = new ArrayList<>();
        //waitlist.add("vaihsali");//we cannt use sting as we already define it as integer
        waitlist.add(87);



    }

}
