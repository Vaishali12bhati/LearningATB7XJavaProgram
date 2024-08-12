package August.ex_04082024.ex_04082024multilevelinheritance;

public class Son extends Father {
    void newsonhome()
    {
        String newsonhomebhk;
        long sonhomecost;
        System.out.println("home belongs to son");
    }
    void home()
    {
        System.out.println("son priority first ");
    }
}
