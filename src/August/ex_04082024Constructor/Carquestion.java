package August.ex_04082024Constructor;
//Write a Java class Car that has two instance variables: model (a String) and year (an int).
// Implement a default constructor that sets model to "Unknown" and year to 0. Also,
// implement a parameterized constructor
// that takes model and year as arguments and initializes the respective instance variables.
public class Carquestion {
    String model;
    int year;

    //instance variable
    //default constructor
    Carquestion() {
        System.out.println("some info about my car");
        model = "unknown";
        year = 0;
        System.out.println("the car model is " + model);
        System.out.println(" the car year was " + year);
    }

    //paramterised constructor
    Carquestion(String unknown, int modified) {
        this.model = unknown;
        this.year = modified;
    }


    void printdetails() {
        System.out.println(model);
        System.out.println("hi" + year);
    }

}

