package August.ex_18082024.Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Lab289hashtablemap {
    public static void main(String[] args) {
        Hashtable s1 = new Hashtable<>();
        //slow
        //synchorised
        //its a legacy class
        //didnt used in automation

        s1.put("kiran",2);
        System.out.println(s1);
//used to print
        Enumeration < Iterator> e = s1.keys();
        //enumerton is only for the hashtable
        while (e.hasMoreElements()){
            System.out.println(s1.get(e.nextElement()));
        }
    }
}
