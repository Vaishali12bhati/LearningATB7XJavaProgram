package August.ex_04082024.ex_04082024Constructor;

public class Lab217localvariable {
    int e = 45;// instance variable

    void varible()
    {
        int e = 23;

        System.out.println(e);//using the local variable here sothe op value should be 23
    }
 void variable2()
    {
        System.out.println(e);//using the instance variable here so the op value should be 45

    }
}
