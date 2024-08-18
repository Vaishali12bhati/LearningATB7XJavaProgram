package August.ex_04082024.polymorph.methoverload;

//polymorphisim
public class Lab231 {
    public static void main(String[] args) {
        Mathfunction addition = new Mathfunction();
        int result = addition.add(2,4);
        System.out.println(result);

        Mathfunction addition1 = new Mathfunction();
        double result1 = addition1.add(4.5,6.3);
        System.out.println("\n");
        Mathfunction addition2 = new Mathfunction();
        String result2 = addition2.add("vaishali","bhati");
        System.out.println(result2);
        System.out.println("\n");

        Mathfunction addition3 = new Mathfunction();
        String result3 = addition3.add("vaihsali",12071994);
        System.out.println(result3);




    }
}
