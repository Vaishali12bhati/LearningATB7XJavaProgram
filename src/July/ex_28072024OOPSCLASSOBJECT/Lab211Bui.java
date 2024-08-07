package July.ex_28072024OOPSCLASSOBJECT;
//classname classref = new clasname();
//classname " name of class
// class ref : reference of class
// new classname()= object
//new : keyword
// Building buildingbuilder = new Building();
//classname : building
//ref = buildingbuilder
//object = new building()
public class Lab211Bui {
    public static void main(String[] args) {
        Building buildingbuilder = new Building();
        buildingbuilder.builder = "dlf";
        System.out.println(buildingbuilder.builder);
        buildingbuilder.activities();
        buildingbuilder.lift();

        System.out.println("\n");

        Building buildingbuilder1 = new Building();
        buildingbuilder.builder = "prestige";
        System.out.println(buildingbuilder.builder);
        buildingbuilder.activities();
        buildingbuilder.lift();


    }
}
