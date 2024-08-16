package August.ex_04082024AccessModifier.Criminal;

import August.ex_04082024AccessModifier.Police.cop;
//public : theif is able to see all the details
public class theif {
    public static void main(String[] args) {
        cop C = new cop(100); //publiv we cn use
        System.out.println(C.gun);
           // C.canishoot();  cant used as it was private
            {
                System.out.println("yes u");
            }
          //c.dutyexchange is not allowed as it was protected and can used in the same package
        }
}

