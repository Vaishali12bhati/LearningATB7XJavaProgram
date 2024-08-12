package August.ex_04082024.ex_04082024hierarchicalinheritance;

public class Lab225fatherson {
    public static void main(String[] args) {
        son1 s1 = new son1();
        s1.home();
        son2 s2 = new son2();
        s2.home();
        son3 s3 =  new son3();
        s3.home();
        //all three different classes calling a single class father
    }

}
