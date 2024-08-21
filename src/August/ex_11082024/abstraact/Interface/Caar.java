package August.ex_11082024.abstraact.Interface;

public class Caar implements Lab236 {
    void drive()
    {
        starting_engine();
        stoping_engine();
    }
    @Override
    public void starting_engine() {
        System.out.println("start car");
    }

    @Override
    public void stoping_engine() {
        System.out.println("stop the car");

    }
}
