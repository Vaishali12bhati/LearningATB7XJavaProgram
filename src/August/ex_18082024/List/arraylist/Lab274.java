package August.ex_18082024.List.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Lab274 {
    public static void main(String[] args) {
        //storestudent having name , id
        studnet s1 = new studnet("manav",9);
        studnet s2 = new studnet("vaishali", 10);
        studnet s3 = new studnet("poornima", 11);

        List studentlist = new ArrayList<>(); //using array list as currently we dont have to add or delete requirement
       //if requirement comes we will use linkedlist
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        System.out.println(studentlist);


    }
}
class studnet {
    private String name;
   private Integer id;

    public studnet(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "studnet{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}