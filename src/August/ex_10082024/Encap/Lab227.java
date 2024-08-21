package August.ex_10082024.Encap;
//have unlimited no of class but only 1 public class

public class Lab227 {
    public static void main(String[] args) {
         vwo_login vw = new vwo_login("admin","vaihsali123");
         vw.name = "vaihsali";
        System.out.println(vw.name);
        //there is no security in the class we cannot gove the access to anyone to change the pass or username
        //now we make the name as private
    }
}
class vwo_login
{
public String name;
public String password;

    public vwo_login(String name, String password) {
        this.name = name;
        this.password = password;
    }
}