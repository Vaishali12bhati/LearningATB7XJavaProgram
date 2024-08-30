package August.ex_17082024.exceptionhandling.throw7throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab258 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException e) {
            System.out.println("cant devide by 0");
        } catch(Exception e2)//multiple catch
        {
            System.out.println("");}
        finally {
            System.out.println("show wil be going om");
        }

        FileReader fileReader = new FileReader(new File("\"C:\\\\Users\\\\ADMI\\\\Desktop\\\\newfile.docx\""));
    }
}
