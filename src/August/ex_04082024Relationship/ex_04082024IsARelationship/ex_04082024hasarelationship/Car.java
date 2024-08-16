package August.ex_04082024Relationship.ex_04082024IsARelationship.ex_04082024hasarelationship;
//called as aggregation concept
public class Car {
    protected void  start_the_car()
    {
     // car has a engine
        //car has a tyre
        //called as aggregation concept
        new Engine().start_engine();// calling the class and the fuction also
        new  Tyre().rolling();

    }
}
