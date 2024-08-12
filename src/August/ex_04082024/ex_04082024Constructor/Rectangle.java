package August.ex_04082024.ex_04082024Constructor;
//Create a class Rectangle with two instance variables length and width (both double).
// Write a default constructor that sets length and width to 1.0. Also,
// write a parameterized constructor that takes two arguments to set length and width.
// Create a method area() that returns the area of the rectangle.
public class Rectangle {
    double leghth;
    double width;
    //instances variable

    //dc
    Rectangle()
    {
        System.out.println("the length are breath are ");
        this.leghth = 1.0;
        this.width = 1.0;
    }

    //pc
    Rectangle(double len, double wid)
    {
        System.out.println("the length and breadth are ");
        this.leghth = len;
        this.width = wid;

    }

    void area_of_rectangle()
    {
        double i;
        i = leghth*width;
        System.out.println( "the area of triagnle is "+i);
    }
}
