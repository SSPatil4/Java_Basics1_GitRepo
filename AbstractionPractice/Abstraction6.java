package AbstractionPractice;
abstract class army{
    abstract void q(int a);
}
abstract class commander extends army{
  abstract void w(int b);
}
abstract class colonel extends army{
    abstract void e(int c);
}
class soldier extends commander{
    void q(int a){
        System.out.println("sssssss"+" "+a);
    }
    void w(int b){
        System.out.println("hhhhh"+" "+b);
    }
}
public class Abstraction6 {
    public static void main(String [] args){
        soldier cc = new soldier();
        cc.q(1);
        cc.w(2);
    }
}
