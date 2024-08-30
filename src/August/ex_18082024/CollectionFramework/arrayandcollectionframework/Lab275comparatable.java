package August.ex_18082024.CollectionFramework.arrayandcollectionframework;
// by comparable we cannot sort the more than one thing at a time so for that we use compator
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab275comparatable {
    public static void main(String[] args) {
        //storestudent having name , id
        student s1 = new student("manav", 14);
        student s2 = new student("vaishali", 10);
        student s3 = new student("poornima", 19);

        List studentlist = new ArrayList<>(); //using array list as currently we dont have to add or delete requirement
        //if requirement comes we will use linkedlist
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        System.out.println(studentlist);
        Collections.sort(studentlist);
        System.out.println(studentlist);

    };

    }
class student implements Comparable<student> {
    private String name;
    private Integer id;

    public student(String name, Integer id) {
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
//function to sort the id
//    @Override
//    public int compareTo( student o) {
//        return Integer.compare(this.id,o.id);
        //function to sort the name
        @Override
        public int compareTo( student o) {
            return CharSequence.compare(this.name,o.name);

        }
}
