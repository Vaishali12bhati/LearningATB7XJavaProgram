package August.ex_17082024.exceptionhandling.checked;
//checked are those jvm knows
//like io exception,sqlexception,broken barrier exception
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checked {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("log.text");
        } catch (FileNotFoundException e) {
            System.out.println("maybe file dont exit");
        }
        //here jvm telling tat you are trying to find a file which doesnt exit
        //so please handle this by using the try and catch

    }


}
