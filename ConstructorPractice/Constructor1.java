package ConstructorPractice;

class owner {
    owner() {
        System.out.println("this is owner" + " " + "saurabh");
    }

    owner(String a) {
        this('S', 'S', 'P');
        System.out.println("this is owner with one para");
    }

    owner(String b, String c) {
        System.out.println("this is owner with two para");

    }

    owner(char a, char b, char c) {
        this("gaurav", "angad");
        System.out.println("this is owner with three para" + " " + "gaurav" + " " + "angad");

    }

}

class ceo extends owner {
    ceo() {
        super();
        System.out.println("this is ceo");
    }

    ceo(int a) {
        System.out.println("this is ceo with one para");
    }

    ceo(int b, int c) {
        this();
        System.out.println("this is ceo with two para");
    }

    ceo(int d, int e, int f) {
        //this(4);
        System.out.println("this is ceo with three para");
    }
}

class manager extends ceo {
    manager() {
        System.out.println("this is manager");
    }

    manager(long a) {
        this(5555, 6666, 7777);
        System.out.println("this is manager with one para");
    }

    manager(long b, long c) {

        System.out.println("this is manager with two para");
    }

    manager(long d, long e, long f) {
        super(12, 13);
        System.out.println("this is manager with three para");
    }
}

public class Constructor1 extends manager {

    Constructor1() {
        super(4545);
        System.out.println("this is constructor1" + " ");
    }

    void a(float marks) {
        System.out.println("print marks" + " " + marks);
    }

    public static void main(String[] args) {
        Constructor1 cc = new Constructor1();
        cc.a(99.99f);
    }
}
