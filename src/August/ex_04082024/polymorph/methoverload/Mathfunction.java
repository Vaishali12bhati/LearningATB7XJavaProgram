package August.ex_04082024.polymorph.methoverload;

public class Mathfunction {
    int add(int a , int b){
        return a+b;
    }
    double add( double a , double b){
        return a+b;

    }
    String add(String a , String b)
    {
        return a+ b;
    }
    String add(String a , int b){
        return a+b;
    }
}
