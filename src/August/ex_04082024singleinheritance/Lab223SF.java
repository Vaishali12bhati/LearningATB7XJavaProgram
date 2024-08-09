package August.ex_04082024singleinheritance;

public class Lab223SF {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.bhk2();//here we can call the function from the son class but not able to call
        //the function of father class
        // so we use extend keyword in the son class to inerit or copy the data of
        // father class so that we can use the father class data also
        // syntax: class Son extends father
        s1.bhk3();//this is the function of class father which we are using with the help of extends
        //keyword in the son class
        //if we remove the extended word than we will not be able to use the father class in son
        //both casses in the same packages


    }



}
