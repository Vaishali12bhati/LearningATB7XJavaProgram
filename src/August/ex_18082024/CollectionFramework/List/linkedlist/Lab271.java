package August.ex_18082024.CollectionFramework.List.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

//element store internally using node representation
//finding an element is very difficult because we have traverse all the notes
//linkedlist stored in the pointing
//starting is head end is tail
//adding deleting is easy
//consume more memory
//in nature its single and double linkd list
//good in manupulating  data
public class Lab271 {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.add("node1");
        mylist.add("node2");
        mylist.add("node3");
        mylist.add("node4");
        System.out.println(mylist);

        ArrayList arr = new ArrayList<>();
        arr.add("node5");
        arr.add("node6");
       arr.add("node7");
        arr.add("node8");
        System.out.println(arr);





    }

}
