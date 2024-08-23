package August.ex_17082024.wrapper;

public class Lab244exapmle {
    public static void main(String[] args) {
        APIautimation testcase = new APIautimation();

    }
}
    class APIautimation{
        static {
            //here i write the code to load data from sql and this will be execute whern
            //created object loaded
            System.out.println("loaded data from sql");
    }
        {
            //here i write the code to load data from csv file
            //this will be execute when class will be loaded
            System.out.println("csv file loaded");
        }
}
