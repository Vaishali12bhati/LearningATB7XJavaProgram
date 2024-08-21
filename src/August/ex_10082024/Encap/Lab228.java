package August.ex_10082024.Encap;
//encapsulation fixed
public class Lab228 {
    public static void main(String[] args) {
        vwo_login2 vw1 = new vwo_login2("admin","vaihsali123");
        System.out.println(vw1.getName());

        System.out.println(" \n now on using the get and set method we are gettimg this");
        System.out.println(vw1.getPassword());
        vw1.setPassword("ad123");
        System.out.println(vw1.getPassword());
        vw1.setName("poornima");
        System.out.println(vw1.getName());
        //there is no security in the class we cannot gove the access to anyone to change the pass or username
        //now we make the name as private
    }
}
class vwo_login2
{
    private String name;
    private String password;
//generate the getter and setter here

    //we have access to get the username
    public String getName() {
        return name;
    }
//we have access to set the username
    public void setName(String name) {
        this.name = name;
    }
//we have access to get the pass
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
//we have access to set the password

    public vwo_login2(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
