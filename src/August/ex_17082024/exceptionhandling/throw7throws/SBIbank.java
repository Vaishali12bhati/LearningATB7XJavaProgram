package August.ex_17082024.exceptionhandling.throw7throws;

public class SBIbank {
    public static void main(String[] args)  throws Exception{
        Bankthrow sbi = new Bankthrow("INR", 100);
//        Bankthrow icic = new Bankthrow("INR",3000);
//        Integer total = sbi.add(icic);
//        System.out.println(total);

        Bankthrow jp = new Bankthrow("USD",20);
        Integer total1 = sbi.add(jp);
        System.out.println(total1);

    }
}
