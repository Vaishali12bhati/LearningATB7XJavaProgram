package August.ex_17082024.exceptionhandling.throw7throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//throw
//comma seprated

public class Lab255  {
    public static void main(String[] args) throws FileNotFoundException {
        extracted();

    }

    private static void extracted() throws FileNotFoundException {
        String path = "C:\\Users\\ADMIN\\Desktop\\newfile.docx";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        System.out.println(fileReader);
    }
}
