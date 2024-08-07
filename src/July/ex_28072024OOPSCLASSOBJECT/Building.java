package July.ex_28072024OOPSCLASSOBJECT;

public class Building {
    int Height;
    String builder;
    String color;
    int floor;
    String lift = "yes";
    String activities = "playing,cycling, walking ";
    String maintainence = "yes";

    void lift()
    {
        System.out.println(lift);
    }
    void activities()
    {
        System.out.println(activities);
    }
    void maintainence()
    {
        System.out.println(maintainence);
    }

}
