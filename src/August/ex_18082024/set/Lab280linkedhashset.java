package August.ex_18082024.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab280linkedhashset {
    public static void main(String[] args) {
        //set doesnt allow the duplicate value
        //in set we having hashset,linkedhashset,tree set+
        // case sensetive
        //op is in the order
        //no proble on adding the null
        Set hs = new LinkedHashSet();
        hs.add("mango");
        hs.add("Mango");
        hs.add("apple");
        hs.add("orange");
        hs.add("strawberry");
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs);
        //we can use different function here
    }
}
