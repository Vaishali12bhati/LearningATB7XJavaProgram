package August.ex_11082024.abstraact.Interface;

public class Lab237interviewquestion {
    public static void main(String[] args) {

    }
}
interface I{
}
class a{}
class b{}
abstract class c{}
class Test extends a{
}
class test2 extends b{}
//class test3 extends a,b{}
class test4 implements I{}
interface i1{}
interface i2{}
class test5 implements i1,i2{}
//multiple inheritance with interface this is possible by using interface only
class test6 extends a implements i1,i2{}
//class test7 implements i1,i2 extends a{}
//not possible as extends should be first
//interface i5 extends a{}
//notpossible
//
// interface i6 extends a,b{}
//not possible
interface i7 extends i2,i1{}
//complete function not possible in interfaces only possible with default method


