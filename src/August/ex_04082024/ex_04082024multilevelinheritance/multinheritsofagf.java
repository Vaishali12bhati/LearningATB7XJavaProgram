package August.ex_04082024.ex_04082024multilevelinheritance;

public class multinheritsofagf {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.home();//calling gf function as father inhert the gf  class and son inherit father
        s1.newhome();//calling father function
        s1.newsonhome();//son calling its own class function
        s1.gfhome();
    }

}
