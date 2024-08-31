package August.ex_18082024.CollectionFramework.arrayandcollectionframework.list.List.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Lab266 {
    public static void main(String[] args) {
//        int[] a = new int[5];
//        a[0] = 4;
//        a[1] = 3;
//        a[2] = 4;
//        a[3] = 5;
//        a[4] = 8;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 4) {
//                System.out.println("found4 " + a[4]);
//            }
//
//        }

//this is difficult as to write long but woth the help pf arraylist
        List mylist = new ArrayList();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        System.out.println(mylist.contains(4));
        System.out.println(mylist.indexOf(3));
        System.out.println(mylist.size());
        Integer s = (Integer) mylist.get(3);
        System.out.println(s);
    }}
