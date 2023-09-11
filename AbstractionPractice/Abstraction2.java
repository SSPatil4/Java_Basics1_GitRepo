package AbstractionPractice;

abstract class parent{
    abstract void a(String a);
}

abstract class child extends parent {
   void a(String a){
        System.out.println("this is child"+" "+a);

    }
}
class gc extends child {
   protected void a(String a){
        System.out.println("hello check"+" "+a);
    }
}

public class Abstraction2 {
    public static void main(String[]args){
        gc check = new gc();
        check.a("print A");
        parent p = new gc();
        p.a("abcd");
    }
}
