package August.ex_18082024.CollectionFramework.arrayandcollectionframework.comparatorable;
//uisng comparator interface we have our own comparision logic
//when we have to sort the data with different basses
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab276comparator {
    public static void main(String[] args) {
        studentdata s1 = new studentdata("vaishali",21);
        studentdata s2 = new studentdata("pramod",29);
        studentdata s3 = new studentdata("manav",23);
        studentdata s4 = new studentdata("mohan",20);
        List<studentdata> detailss = new ArrayList();
        detailss.add(s1);
        detailss.add(s2);
        detailss.add(s3);
        detailss.add(s4);
        System.out.println(detailss);
        Collections.sort(detailss,new sortbyname());
        System.out.println(detailss);
        Collections.sort(detailss,new sortbyrollno());
        System.out.println(detailss);
        Collections.sort(detailss,new sortbynamedesc());
        System.out.println(detailss);
    }

}
class  sortbyname implements Comparator<studentdata> {
    @Override
    public int compare(studentdata o1, studentdata o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class  sortbyrollno implements  Comparator<studentdata>{

    @Override
    public int compare(studentdata o1, studentdata o2) {
        return Integer.compare(o1.getRollno(),o2.getRollno());

    }
}
class sortbynamedesc implements Comparator<studentdata>{

    @Override
    public int compare(studentdata o1, studentdata o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

class studentdata  {
    private String name;
    private Integer rollno;

    public studentdata(String name, Integer rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "studentdata{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
