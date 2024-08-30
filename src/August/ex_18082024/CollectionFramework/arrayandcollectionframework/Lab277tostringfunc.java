package August.ex_18082024.CollectionFramework.arrayandcollectionframework;
//without the string to fn we got the randon output which was thethe address fof the
public class Lab277tostringfunc {
    public static void main(String[] args) {
        car c1 = new car("waganor",1211);
        car c2 = new car("honda",1311);
        System.out.println(c1);
    }
}
class car extends Object
{
    String brand;
    Integer dateofpurchase;

    public car(String brand, Integer dateofpurchase) {
        this.brand = brand;
        this.dateofpurchase = dateofpurchase;
    }

    @Override
    public String toString() {
        return "brand >>"+ brand + ",dateofmodification>>" + dateofpurchase;
    }
}
