package August.ex_17082024.nestedclass;

public class Lab246nextedexample {
    public static void main(String[] args) {
        car c = new car("waganor");
        c.drive();
        System.out.println(c.make);
        car.gearbox cg = c.new gearbox();//how we create the inner class object
    }
}
class car {
    String make;

    public car(String make) {
        this.make = make;
    }

    void drive() {
        System.out.println("methood also");
    }

    class gearbox {
        void m2() {
            System.out.println("car having gearbx");
        }

        class nutbolts {
            void m3() {
                System.out.println("notbolts having gear box");
            }
        }
    }
}

