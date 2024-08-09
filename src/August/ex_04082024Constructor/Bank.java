package August.ex_04082024Constructor;

public class Bank {
    String Bname;
    int bal;
    String Bifsc_code;
    Bank()
    {
        System.out.println("hello welcome to the bank directory");
    }
//pc
    Bank(String name, int balance , String Bcode)
    {
        this.Bname = name;
        this.bal = balance;
        this.Bifsc_code = Bcode;


    }
    void printdetails()
    {
        System.out.println("the name of the bank is "+Bname);
        System.out.println("the balance is "+bal);
        System.out.println("the bank ifsc code is "+Bifsc_code);
    }
}
