package July.ex_14072024;

public class Lab086 {
    public static void main(String[] args) {
        String name = new String("the testing academy");
        String name1 = new String("the testing academy");
        String name2 = new String("the testing academy");
        String name3 = new String("the testing academy");
        System.out.println(name==name1);// refrence checking thats why false
        System.out.println(name.equals(name1));//content checking that why true

    }
}
