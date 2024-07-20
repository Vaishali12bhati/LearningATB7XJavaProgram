package ex_14072024;

public class Lab088 {
    public static void main(String[] args) {
        String password = "Vaishali@123";
        String paas_u = password.toLowerCase();
        System.out.println(paas_u);
        System.out.println(paas_u==password);
        System.out.println(paas_u.equals(password));//false : as refrence are different , as after lower case its create a new string
        System.out.println(paas_u.equalsIgnoreCase(password));//it will check the content is same or not
                                            // no cases will be checking ignoring
        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('v'));
        System.out.println(password.length());

    }
}
