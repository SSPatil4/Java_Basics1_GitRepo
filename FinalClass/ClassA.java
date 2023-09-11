package FinalClass;

final class test {

    {
        System.out.println("IIB is here");
    }

    test() {
        System.out.println("constructor is here");
    }

    int no = 12121;            // can modify
    static int age = 120;
    final int mob = 454;           // cannot modify it

    final void add() {
        System.out.println("final void add method");
    }

    static void show() {
        System.out.println("static hello show");
    }

    static {
        System.out.println("SIB block of ");

    }
}

public class ClassA {

    public static void main(String[] args) {
        test obj = new test();

        System.out.println((obj.age++) + " " + (obj.mob) + " " + (obj.no++) + " " + (obj.no++));
        test obj1 = new test();
        System.out.println((obj1.age++) + " " + (obj1.mob) + " " + (obj1.no++));
       /* System.out.println(obj.no);
        test.show();
        obj.add();*/
    }

    static void see() {
        System.out.println("hello see");
    }

    void alpha() {

    }

}

class testing121212 extends ClassA{
    @Override
    void alpha() {
        super.alpha();
    }
}