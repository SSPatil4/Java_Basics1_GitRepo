package AbstractionPractice;

abstract class exam {
    abstract int a(char a);

}

abstract class test extends exam {
    abstract int b(char s);

    void c(long l) {
        System.out.println("mob no" + " " + l);
    }

}

class doubt extends test {
    void a(int d) {
        System.out.println("hhhh");
    }

    int a(char a) {
        System.out.println("aaaaaa" + " " + 'A');
        return 20;
    }

    int b(char s) {
        System.out.println("bbbbb" + " " + s);
        return 25;
    }
}

public class Abstraction4 {
    public static void main(String[] args) {
        doubt ck = new doubt();
        ck.a(1);
        ck.a('P');
        ck.c(9822230735l);
        ck.b('Z');
    }
}
