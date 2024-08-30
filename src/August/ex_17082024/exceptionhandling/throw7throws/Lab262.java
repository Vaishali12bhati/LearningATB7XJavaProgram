package August.ex_17082024.exceptionhandling.throw7throws;

public class Lab262 {
    public static void main(String[] args) throws Exception{
        try {
            String s = null;
            if (s == null){
             throw new Exception("ADD A PROPER STRING");
            }
            s.trim();
        } catch (Exception e) {
            System.out.println("string is null");
        }

    }
}
