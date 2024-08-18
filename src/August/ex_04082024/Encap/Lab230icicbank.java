package August.ex_04082024.Encap;

public class Lab230icicbank {
    public static void main(String[] args) {
        ICIC_bank acc = new ICIC_bank("admi",1000);
        acc.getBalance();
        System.out.println(acc.getBalance());
        acc.setBalance(344400l,false);

        ICIC_bank acc2 = new ICIC_bank("admin",108330);
        acc2.setBalance(30977l ,true);
        System.out.println(acc2.getBalance());//get the balance
        //set the balance if its admin

        ICIC_bank acc3 = new ICIC_bank("vaishali",4000);
        acc3.setName("manav",true);
        System.out.println(acc3.getName());




    }
}
