package August.ex_18082024.List.Stack;

import java.util.Stack;

//legacy class
//not going to used in automation much
//legacy means old
//statck object cannt be access by multiple thread
//imp function peek(),pop(),push(),search
//for delete last one will be sdelete first(top one)
//LIFO: LAST IN FIRST OUT
//for addition first one will be the last one to out
public class Lab273 {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.add("pramod");
        s.add("dutta");
        s.add("vaishali");
        System.out.println(s.peek());//last one he will see
      //  System.out.println(s.push("manav"));
        System.out.println(s.pop());

        System.out.println(s);
    }
}
