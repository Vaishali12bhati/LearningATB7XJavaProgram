package August.ex_04082024Constructor;
//Design a class Employee with three instance variables:
// name (a String), id (an int), and salary (a double).
// Write a default constructor that assigns "John Doe" to name, 0 to id, and 50000.0 to salary.
// Implement a parameterized
// constructor that allows setting all three instance variables when creating an Employee object.
public class Employee {
    //instance variable
    String name;
    int id;
    double salary;
    //dc
    Employee()
    {
        this.name = "john";
        this.id = 0;
        this.salary = 450000;
    }
    //pc
    Employee(String ename, int eid, double eslary){
        this.name = ename;
        this.id = eid;
        this.salary = eslary;

    }
}
