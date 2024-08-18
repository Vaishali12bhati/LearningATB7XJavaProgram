package August.ex_04082024.ex_04082024AccessModifier.Police;

public class cop {
    public int gun;
    private String idcard; //only the same final can use them

    public cop(int gun) {
        this.gun = gun;
    }

    private void canishoot()
        {
            System.out.println("yes");
        }

        protected void dutyexchange()
        {
            System.out.println("exchangeduty");
        }
    }
