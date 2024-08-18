package August.ex_04082024.SUPERTHIS;

public class CAR extends Vehicle {
    int maxspeed = 200;

    public CAR()
    //dc
    {super();//constructor chaining
         System.out.println("dc of a car");
    }
    public CAR(int ca){

        System.out.println("pc of a car");
    }
    @Override
    public void message()
    {
        System.out.println("overiding the value of vehile");

    }

            void display() {
                System.out.println("hello car");
                System.out.println("vehicle speed is "+super.maxspeed);//calling the class from the super class or paret class/vechile
                System.out.println("car speed is "+ this.maxspeed);//callint it from the child class that it car
                System.out.println("overiding the value of vehile");
                super.message();
                this.message();
                this.message(3.5);
                super.message(9.4);
                super.message(8);
                this.message(7838);
                super.Vehicle();
                super.Vehicle(9);



            }

        }


