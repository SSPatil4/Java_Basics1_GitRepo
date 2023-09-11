package AbstractionPractice;

public class Test extends TEST01{
    protected void m1(){
        System.out.println("One");
    }
}

abstract class TEST01 {
//private >default >protected >public
     abstract void m1();
}
