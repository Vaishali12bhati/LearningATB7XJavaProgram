package July.ex_28072024OOPSCLASSOBJECT;

public class Car { //public means any one use
    // class is the keyword
    //car is the identifier as its the name of class

    String brand= "amazing";
    String color;
    engine er;// has a
    //car has a engine

    tyre ty;
    //car has a tire


    void automatic()
        {
            System.out.println(" its an semin automatic");
    }

 void CNG() {
     System.out.println("no ");
    }

class engine{

    }

    class tyre{

    }



    public static void main(String[] args) {
        Car amaze = new Car();
        Car maruti = new Car();
        maruti.brand = "next";
        Car Hundai = maruti;//its just a refrence
        //only two objects are there maruti and amaze


        amaze.brand = "honda";
        amaze.color = "blue";
        System.out.println(Hundai.brand);
//        amaze.automatic();
//        amaze.CNG();
        //System.out.println(amaze.brand);
    }
}


