package August.ex_10082024.containalltopics;

public class realtimeinheritance {
    public static void main(String[] args) {
     Baseclass t1 = new Testcase();///dynamic dipatch
     t1.getBrowser();
  //   t1.setBrowser("chrome",true); already used it
     //t1.openBrowser();
     t1.openBrowser("www.google.com");
     t1.closeBrowser();



    }
}
class Baseclass {
    private String browser; //setting a browser as a private
    // using getter and setter
    Baseclass()
    {
        System.out.println("dc of baseclass");//default constructor
    }

    Baseclass(String b)
    {
        System.out.println("pc for the baseclass");
    }


    public String getBrowser() {
        return browser;
    }
//everyone cant set the value of browser so using authorisation condition to verify only admin can run
    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("you are not authorise");
        }
    }
        //adding two function to show the concept of method overloading
        //using same name of function
        void openBrowser() {
            System.out.println("simple browser");//dont give anything it will open
        }
        void openBrowser(String browsername){
            System.out.println(browsername);//the name we will it will open that
        }
        void  closeBrowser()
        {
            System.out.println("closed the browser");
        }

    }
    //now using concept of single inheritance by using keyword extends
class Testcase extends Baseclass{
    Testcase(){
        super();
        this.setBrowser("edge",true);
    }


    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser,isAuth);

    }



    }


