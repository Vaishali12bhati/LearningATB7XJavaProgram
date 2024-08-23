package August.ex_17082024.anaonymousclass;

public class Lab246anonymous {
    public static void main(String[] args) {
        ABC a = new ABC() {

            @Override
            public void turmeric() {

            }

            @Override
            public void ginger() {

            }


        };//called anonymous class
        CBA c = new CBA() {
            @Override
            void join() {

            }

            @Override
            void notjoin() {

            }
        };

        }
    }




interface ABC{
    void turmeric();
    void ginger();

}

abstract class CBA{
abstract  void join();
abstract void notjoin();
}
