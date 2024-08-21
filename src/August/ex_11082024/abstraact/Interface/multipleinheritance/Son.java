package August.ex_11082024.abstraact.Interface.multipleinheritance;

public class Son implements Mother,Father{
void family(){
    money();
    home();
}
    @Override
    public void home() {
        System.out.println("its completing by son either of father or mother");
    }

    @Override
    public void money() {
        System.out.println("its of by default father");

    }
}
