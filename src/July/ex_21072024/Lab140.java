package July.ex_21072024;
//mix loop wth exit condition
public class Lab140 {
    public static void main(String[] args) {
        for (int i =1;i< 10;i++){
            System.out.println(i);//if we write print it will print 5 before breaking
            if (i == 5) {
                break;
            }
                System.out.println("hello world"+ i);//on printing after it will not print 5

            }
        }
    }

