package August.ex_18082024.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab279hash {
    public static void main(String[] args) {
        //set doesnt allow the duplicate value
        //in set we having hashset,linkedhashset,tree set+
        //in this the o/p should be random as having no order
        //hashing mechanism to store the element , no order
        //in the memory they store randomly its doesnt have any order
        // case sensetive
        //no problem in adding the null
        Set hs = new HashSet();
        hs.add("mango");
        hs.add("Mango");
        hs.add("apple");
        hs.add("orange");
        hs.add("strawberry");
        System.out.println(hs);
    }
}
