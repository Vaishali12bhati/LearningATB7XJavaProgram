package July.ex_28072024OOPSCLASSOBJECT.ex_27072024ARRAY1D2DARRAY;
//stringbuilder and string buffer provide the mutuable sequence
public class Lab205 {
    public static void main(String[] args) {
        String s1= "vaishali";
        s1 = "dutta";
        //here on the changing the value of s1 there will be two value of s1 in the string pool

        //but now we use the string builder
        StringBuffer stringBuffer = new StringBuffer("pramod");
        stringBuffer.append("dutta");
        System.out.println(stringBuffer);
        //thread safety | synchronised(one by one by) | slow due to synchronisation

        StringBuilder stringBuilder = new StringBuilder("mystring");
        stringBuilder.append("intresting");
        System.out.println(stringBuilder);
        //no thread safety|Not synchronised |faster
        //because of faster performance and not thread safe we used mostly string builder
        //sometimes its depends on the requirements
    }




}
