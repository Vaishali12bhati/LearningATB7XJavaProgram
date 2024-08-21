package August.ex_11082024.abstraact.Interface.example2interfc;

public interface Eng {
    void start();
    void stop();
    default void oiling()//we cannot used complete function
            //can only be used by using default keyword
    {
        System.out.println("check the oil");
    }

    static void petrol()
    {
        System.out.println("check the fuel");
    }
}
