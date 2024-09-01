package August.ex_18082024.List.arraylist;

import java.util.*;

public class Lab268 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(45);
        marks.add(43);
        marks.add(47);
        marks.add(35);
        System.out.println(marks);
        Collections.sort(marks);
        Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);

    }
}
