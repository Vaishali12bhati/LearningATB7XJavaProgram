package August.ex_04082024.ex_04082024multilevelinheritance;
//multilevel inheritance basicaly means on one level to another
public class realbasttestgtesttestcase {
    public static void main(String[] args) {
        TestCase t1= new TestCase();//default constructor
        t1.closeBrowser(); //calling function from super class
        t1.getDataSQL();//calling form super super class
        t1.startBrowser();//calling from subclass
        t1.diamond= t1.diamond;

        System.out.println(t1.diamond);

    }
}
