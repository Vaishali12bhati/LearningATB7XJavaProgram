package July.ex_14072024;
//comparing the memory on the basis of content using the equal method()
public class Lab085 {
    public static void main(String[] args) {
        String name = "the testing academy";//scp1
        String name1 = "the testing academy";//scp 1
        String name2 = new String("the testing academy");//heap string 1
        String name3 = new String("the testing academy");//heap string 2
        System.out.println(name2.equals(name3));//check for the content
        System.out.println(name.equals(name3));//check for the content

    }

}
