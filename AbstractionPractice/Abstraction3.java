package AbstractionPractice;
abstract class sun{
    abstract void a(int b);

}

abstract class earth extends sun {
    abstract void b(int c);


}
class moon extends earth{
    void a(int b){
        System.out.println("print hello"+ " "+b);
    }
    void b(int c){
        System.out.println("hello print"+" "+c);
    }

}
public class Abstraction3 {
    public static void main(String[] args) {
        moon ck = new moon();
        ck.a(123);
        ck.b(156);
    }
}
