package August.ex_10082024.Encap;
//login page 4
//username
//pass
//button login

public class vwologinpage {

    public String getUsername(boolean isadmin) {
        if (isadmin) {
            return username;
        }else
        {
            return null;
        }
    }
    public String getPassword() {
        return password;
    }

    public String getLogin_button() {
        return login_button;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private  String password;
    private  String login_button;

}
