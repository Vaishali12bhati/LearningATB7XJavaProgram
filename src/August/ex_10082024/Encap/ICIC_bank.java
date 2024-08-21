package August.ex_10082024.Encap;

public class ICIC_bank {
    private String name;
    private long balance;

    public String getName() {
        return name;
    }

    public void setName(String name,boolean isAuth) {
        if (isAuth) {
            this.name = name;
        } else {
            System.out.println("not verified");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isAuth) {
        if (isAuth){
        this.balance = balance;

    }else{
            System.out.println("you are not the administrator");
        }

    }

    public ICIC_bank(String name, long balance) {
        this.name = name;
        this.balance = balance;

    }
}

