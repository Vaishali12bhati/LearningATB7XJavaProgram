package July.ex_28072024OOPSCLASSOBJECT;
//oops concept
//class blueprint having the attributes and behaviour
//instances of the class

public class Lab210 {
    public static void main(String[] args) {
        Person person = new Person();
        person.gender = "female";
        person.Name = "vaishali";
        person.roll_number = 12;

        Person person1 = new Person();
        person1.roll_number = 13;
        person1.Name = "mansi";
        person1.gender = "female";
        person1.height = 173;
        System.out.println("the details of the person is \n" + person1.Name + "\n" + person1.height + "\n" + person1.gender);
        System.out.println("the details of the another person is \n" + person.Name + "\n" + person.height + "\n" + person.gender);

    }
}