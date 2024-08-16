package August.ex_04082024AccessModifier.Police;

public class junior_cop {
    public static void main(String[] args) {
        cop C = new cop(100);
        //not abel to used the caniused function as it was private in class function
        //cannot used theif as c
        C.dutyexchange();/// we can use it as it was with the protected
        //c.canishoot// cannot used as it was private as only cop can use it
        {

        }
    }
}
