package July.ex_14072024;
//comparing the heap and scp string on the basis of refrences
public class Lab084 {
    public static void main(String[] args) {
        String name = "the testing academy";//scp1
        String name1 = "the testing academy";//scp 1
        String name2 = new String("the testing academy");//heap string 1
        String name3 = new String("the testing academy");//heap string 2


        System.out.println(name2 == name3);//both heap
        System.out.println(name1 == name3);//scp and heap//check for ref
        System.out.println(name1 == name);//scp both
    }
}
