package August.ex_10082024.polymorph.override;
//overriding or runtimw poly

//
public class Lab232 {
    public static void main(String[] args) {
        labra ld1 = new labra();
        ld1.bark();//its calling the bark from the labra as we learn in inheritance the priority will be first of lower class


        Dog d1 = new Dog();
        d1.bark();//here is calling from the dog only


        Dog d2 = new labra();// here we are calling labra claass as creating the object of labra
        //REF IS DOG BUT OBJECT IS LABRA
        //IT WILL DECIDE AT A RUN TIME THE JVM WILL  BE DECIDE
        d2.bark();//here we are calling from the labra only
        // for remember the right was always calling the object we are calling at right side we are calling the
        //function of that classs


       // labra ld2 = new Dog();//WE CANNOT DO THIS AS CHILD CLASS CANNOT CALL THE PARENT CLASS

    }
}
