package July.ex_28072024OOPSCLASSOBJECT;
//attributes are the data member / properties // instance variable
// behaviour know as also methods

public class Lab212dog {
    public static void main(String[] args) {
        Dog details = new Dog();//creating real object
        details.breed = "labra"; //calling attributes
        details.name = "dimpy";
        details.age = 5;
        details.walk(); //calling behaviour

        Dog details1 = new Dog();
        details1.name = "julie";
        details1.breed = "chow chow";
        details1.age = 4;
        details1.walk();
        System.out.println(details1.name);




    }
}
