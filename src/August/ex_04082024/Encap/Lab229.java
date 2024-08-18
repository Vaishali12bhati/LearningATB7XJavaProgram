package August.ex_04082024.Encap;
//how to use isauth the password so that no one can change it
public class Lab229 {
    public static void main(String[] args) {
        vwo_login3 vw2 = new vwo_login3("admin","vaihsali123");
        System.out.println(vw2.getName());

        System.out.println(" \n now on using the get and set method we are gettimg this");
        System.out.println(vw2.getPassword());
        System.out.println(vw2.getPassword());
        vw2.setName("poornima");
        System.out.println(vw2.getName());
        vw2.setPassword("vaishali12",true);
        System.out.println(vw2.getPassword());
        //there is no security in the class we cannot gove the access to anyone to change the pass or username
        //now we make the name as private
    }
}
class vwo_login3
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
    public void setPassword(String password, boolean isAuth) {
        if (isAuth){
            this.password = password;
        }else {
            System.out.println("not a valid person");
        }

    }
//we have access to set the password

    public vwo_login3(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
