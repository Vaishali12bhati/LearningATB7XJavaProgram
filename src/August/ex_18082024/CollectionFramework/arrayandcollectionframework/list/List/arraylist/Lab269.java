package August.ex_18082024.CollectionFramework.arrayandcollectionframework.list.List.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Lab269 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();//for specific datatype this will oly add strictlly integr
        marks.add(45);
        marks.add(89);
        List<String> name = new ArrayList<>();
        name.add("vaihs");
        name.add("priya");
        name.add("pampam");
//        System.out.println(name);
//        System.out.println(marks);
//        for (Object o:name);
//        System.out.println(name);
        for (int i=0;i<name.size();i++)
        {
            System.out.println(name.get(i));
        }
    }
}
