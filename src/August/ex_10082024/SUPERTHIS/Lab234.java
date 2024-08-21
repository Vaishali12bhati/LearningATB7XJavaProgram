package August.ex_10082024.SUPERTHIS;

public class Lab234 {
}
class student extends person{
    //is a relationship
    @Override
    void messages()
    {
        System.out.println("i am student");
    }
    void display()
    {
        super.messages();
        this.messages();
    }

}
class person
{
void messages(){
    System.out.println("i am a person");
}
}


