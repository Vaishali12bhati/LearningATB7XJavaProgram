package August.ex_11082024.Abstractionconcept.Carexample;

public class Car extends Engine{
    @Override
    void start() {
        System.out.println("start the car");
    }

    @Override
    void stop() {
        System.out.println("stop the car");

    }

    @Override
    void putgears() {
        System.out.println("put the gear part ");

    }

    @Override
    void openthedoor() {
        System.out.println("open the car door with key");

    }

    @Override
    void closethedoor() {
        System.out.println("close the car door");

    }
}
