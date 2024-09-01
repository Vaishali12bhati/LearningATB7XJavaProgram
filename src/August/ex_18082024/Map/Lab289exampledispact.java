package August.ex_18082024.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab289exampledispact {
    public static void main(String[] args) {
        Map<Integer,String>  studnetinfor = new HashMap<>();

        studnetinfor.put(1, "vaishali");
        studnetinfor.put(2, "humari");
        studnetinfor.put(3, "happy");
         studnetinfor.put(null,"muskan");//as a key we have ony 1 null
         studnetinfor.put(4,null);
        studnetinfor.put(5,null); //as a value we have many null
      System.out.println(studnetinfor);
        System.out.println(studnetinfor.size());
        System.out.println(studnetinfor.isEmpty());
        System.out.println(studnetinfor.containsValue("vaishali"));
        for(Map.Entry<Integer,String> item:studnetinfor.entrySet()){
            System.out.println(item.getKey()+" ->"+item.getValue());
        }

    }
}