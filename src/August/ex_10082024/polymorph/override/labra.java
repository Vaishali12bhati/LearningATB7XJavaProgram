package August.ex_10082024.polymorph.override;

public class labra extends Dog {

    @Override //its means that we have s same name function in the dog(parents class)
    void bark()//the function name is same  as dog class
            // so here we have genrated a copy of dog class by using extends

    {
        System.out.println("i am labra so i have to bark");
    }
}
