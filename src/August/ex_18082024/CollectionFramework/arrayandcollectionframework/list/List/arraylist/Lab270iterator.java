package August.ex_18082024.CollectionFramework.arrayandcollectionframework.list.List.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab270iterator {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();//for specific datatype this will oly add strictlly integr
        marks.add(45);
        marks.add(89);
        List<String> name = new ArrayList<>();
        name.add("vaihs");
        name.add("priya");
        name.add("pampam");

        Iterator<String> its = name.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }

    }
}
