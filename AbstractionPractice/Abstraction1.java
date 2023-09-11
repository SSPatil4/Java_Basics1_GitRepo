package AbstractionPractice;

abstract class animals {
    abstract void a(String a);

}

abstract class lion extends animals {
    abstract void b(String b);
     void a (String z){
        System.out.println("diff implementation");
    }

    void c(String c) {
        System.out.println("this is lion here" + " " + c);

    }

    void e(int a) {
        System.out.println("print value" + " " + a);
    }
}

class tiger extends lion implements Dd {
    void a(String s) {
        System.out.println("this is tiger" + " " + s);
    }

    void b(String b) {
       // b = "saurabh";
        System.out.println("print name " + b);
    }

    public void show(int a, char b) {
        System.out.println("override of Dd interface method" + a + b);
    }


}

interface Dd {
    public void show(int a, char b);

    private void add() {
        System.out.println("private add meth of Dd");
    }

}

public class Abstraction1 {
    public static void main(String[]args){
        lion ab = new tiger();
        ab.a("hello");
        ab.b("hii");
        ab.c("welcome");
        ab.e(10);
    }
}