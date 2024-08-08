package ex_04082024Constructor;
//default constructor
//name should be name as the class name
// we can create only 1 constructor
public class Lab216car {
    public static void main(String[] args) {
        Car c1 = new Car();//only called with the new keyword
        // it give no output as still we didnt  assign any value to car()
        Car c2; // this also not give any output as we are not calling new car() constructor in this
        Car c3 = new Car(); // this line give the op as now we define the value of car() constructor here
      // now C1 also have the op also
        //purpose of constructor
        // where i can write any code which i want to execute
        // before starting the program
        new Car(); // this is also the calling constructor but there is refrenc variable to point


}}
