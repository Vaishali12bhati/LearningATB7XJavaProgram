package August.ex_10082024.SUPERTHIS;

public class Lab235 {

    //super variable>> use this if u want to call the parent variable
    //super.method>> use if you want to call the parent method
    //super(); //use if you want to call the parent dc
    //super(value) //use if you want to call the parent pc
    //this //use for calling ur own variable
    //this() // use for calling the own method

}
class person1 {
    person1() {
        System.out.println("person1");
    }
    person1(String a)
    {
        System.out.println("pc person2");
    }
    person1(String a , int b){
        System.out.println("pc person3");
    }
}
class student1 extends person1{
   student1()
   {
       super("vaishali",45);
      //this("vaishali") we cannot our constructor only
       //super();//at a time only single super can use
        System.out.println("dc student1");
   }
   student1(String a )
   {
       System.out.println("pc of student");
   }

}
