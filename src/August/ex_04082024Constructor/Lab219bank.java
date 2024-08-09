package August.ex_04082024Constructor;

public class Lab219bank {
    public static void main(String[] args) {
        Bank B = new Bank();
        System.out.println("-------details of first user-------- ");
      Bank B1 = new Bank("SBI",123,"ISC001");
      B1.printdetails();
        System.out.println("-----details of second user-----------");
      Bank b2 = new Bank("icic",321,"ifc001");
      b2.printdetails();

//        System.out.println(B1.Bname);
//        System.out.println(B1.bal);
//        System.out.println(B1.Bifsc_code);
//        System.out.println(b2.Bname);

    }
}
