package August.ex_11082024.Abstractionconcept.Carexample;
//we have to change here the some of the outuput for waganor
public class WagonR extends Engine{
    void wagnordetails(){
        start();
        stop();
        closethedoor();
    }


    @Override
    void start() {
        System.out.println("its an automtaic");
    }

    @Override
    void stop() {
        System.out.println("check the break");

    }

    @Override
    void openthedoor() {

    }

    @Override
    void closethedoor() {
        System.out.println("having senson");

    }

    @Override
    void putgears() {

    }

}

