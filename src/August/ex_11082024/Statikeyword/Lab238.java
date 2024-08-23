package August.ex_11082024.Statikeyword;

public class Lab238 {
    public static void main(String[] args) {
        //same as here the static block
        //is calling aitomatically whenever we call the learningautomaticon class in starting only it will
        //run the static block
        // class op will be print firt
    System.out.println(learningautomationbatch.batch_name);///using static we can directly calll variable name
        // no need to create the object
     learningautomationbatch course = new learningautomationbatch("vaishali");//here the static bloock
        //is calling aitomatically whenever we call the object  in starting only it will
        //run the static block
     System.out.println(course.getName());


     learningautomationbatch class2 = new learningautomationbatch("bhati");
        System.out.println(course.getName());

        learningautomationbatch.mustdoassignment();//directly calling function using static


    }
    //static keyword in java is used for the memory management
    //i static we used same variable and method in a java class
    //static keyword is non acess modifier on java and applicaple to the
    //blocks
    //variable
    //method
    //classes
    //if you have a same name it will be static otherwise not
    static class learningautomationbatch{
        {
            System.out.println("start learning the automation");//static block
        }
        static {
            System.out.println("load this class i will execute");//first this will be loaded
            //same as here the static bloock
            //is calling aitomatically whenever we call the learningautomaticon class in starting only it will
            //run the static block
        }
        private  String name;
        static  String batch_name = " automation courrse";//static variab;e
        //we need encapsulation to call then name


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public learningautomationbatch(String name) {
            this.name = name;
        }
        static void mustdoassignment()
        {
            System.out.println("all have to do");
        }
    }
}
