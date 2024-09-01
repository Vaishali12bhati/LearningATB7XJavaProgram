package August.ex_18082024.List.arraylist;

import java.util.ArrayList;

public class Lab265arraylist {
    public static void main(String[] args) {
        //collection framework
        //collection >>interface
        //list >>interface
        //list having class>> arraylist ,linked list,vector stack
        //list lik shopping list , groceeri list,item,marklist
        //List mylist = new ArrayList<>();//dynamic dispatch//not use
        //we are going to used the arraylist when
        //ading and deleting is heavy operation
        //its dynamic in nature

       // Collection mylist3 = new ArrayList<>();//dynamic dispatch//not use
        ArrayList mylist2 = new ArrayList<>();
        mylist2.add("vaihsali");
        mylist2.add("pramod");
        mylist2.add("manav");
        mylist2.add("maa");
        mylist2.add(12);
        mylist2.add(0);
        mylist2.add("pramod");
        mylist2.add(true);//boolean
        //duplicate
        //contain , isempty, size,get, add, getlast, indexof,remove,clear
//        System.out.println(mylist2);
//       System.out.println(mylist2.contains(0));
//        System.out.println(mylist2.contains("vaishali"));
//        System.out.println(mylist2.getFirst());
//        System.out.println(mylist2.contains("hema"));
//        System.out.println(mylist2.size());
//        System.out.println(mylist2.get(2));
//        System.out.println(mylist2.getLast());
//        System.out.println(mylist2.indexOf("manav"));
//        System.out.println(mylist2.add("happy"));
//        System.out.println(mylist2);
//        String s = (String) mylist2.get(3);
//        System.out.println(s);
//        System.out.println(mylist2.remove(7));
//        System.out.println(mylist2);
//         mylist2.clear();
//        System.out.println(mylist2);
//        mylist2.addAll(7, Collections.singleton("vva"));
//        System.out.println(mylist2);
//        mylist2.set(3,"apna");
//        System.out.println(mylist2);
//        System.out.println(mylist2.isEmpty());
//        mylist2.clear();
//        System.out.println(mylist2);
//        System.out.println(mylist2.isEmpty());

//how to print 1 method using for loop
        for (int i = 0;i<mylist2.size();i++)
        {
            System.out.println(mylist2.get(i));
        }
 //methdd 2 using for each
        System.out.println("--------------2ndmethod/enhancedforloop----------------------");
        for (Object o :mylist2)
        {
            System.out.println(o);
        }

        System.out.println("3method");

    }
}
