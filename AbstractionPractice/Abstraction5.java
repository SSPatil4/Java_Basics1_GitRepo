package AbstractionPractice;
abstract class flower{
    abstract void q(String a);
}
abstract class rose extends flower {
    abstract void w(String b);
}
class gold extends rose{

    void q(String a){
        System.out.println("this is flower"+" "+a);
    }
    void w(String b){
        System.out.println("this is gold"+" "+b);
    }
}
public class Abstraction5 {
    public static void main(String[] args) {
        gold cc = new gold();
        cc.q("Rosegold");
        cc.w("mariegold");
    }
}
