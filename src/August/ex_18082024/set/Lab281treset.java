package August.ex_18082024.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab281treset {
    public static void main(String[] args) {
        //set doesnt allow the duplicate value
        //in set we having hashset,linkedhashset,tree set+
        //this will sort them automatically bases of on the first letter
        // case sensetive
        //we cannot use null in tree as that was a problem in sorting
        //normal for loop not allowed
        Set hs = new TreeSet<>();
        hs.add("mango");
        hs.add("Mango");
        hs.add("apple");
        hs.add("orange");
        hs.add("strawberry");
        System.out.println(hs);
//method to print 1
//        for (Object o : hs){
//            System.out.println(o);
//        }
        //other method by using iterator
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
