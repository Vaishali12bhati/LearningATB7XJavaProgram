//Steps that the JVM takes to call the main method:
//Loads the necessary classes for the program.
//Locates the entry point class specified on the command line.
//Locates the main method in the entry point class.
//Sets up the environment and executes the code inside the main method.
//When the main method completes, the JVM terminates the program.
package ex_07072024;
public class Lab007 {
    public static void main(String[] args) { //JVM recognise only this part
        // jvm starts the  project after this main method and after { braces
       //args can be any thing
        System.out.println("Lab007"); //statements
        System.out.println("Lab008");
        //jvm execute these all given statements which are under the {braces
    }
}// here the curly braces are closing so jvm terminate the program
