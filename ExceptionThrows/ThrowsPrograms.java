package ExceptionThrows;

class A {
    void show() {
        System.out.println("Show method");
    }
}
class B {
    void see() {
        
        System.out.println("see method");
    }
}
class C {

    int np = 10099;
    void seen() throws NullPointerException{
        B b = new B();
        b.see();
        String line = null;
        System.out.println(line.length());
    }
}
public class ThrowsPrograms {
    public static void main(String[] args) {
        C c = new C();
       try {
           c.seen();
       }catch(NullPointerException e){
           System.out.println("null pointer caught");
       }

        /*String line = null;
        System.out.println(line.length());*/
    }
}
