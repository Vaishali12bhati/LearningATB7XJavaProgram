package August.ex_17082024.exceptionhandling.throw7throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab256 {

    public static void main(String[] args) throws FileNotFoundException,ArithmeticException {
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            c = b/a;
        } catch (Exception e) {
            System.out.println("cant devide by 0");
        }
        System.out.println(c);
        String path = "C:\\\\Users\\\\ADMI\\\\Desktop\\\\newfile.docx";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("pls checl the file name");
        }
        System.out.println(path);

    }}
