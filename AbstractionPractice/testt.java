package AbstractionPractice;

abstract class music {
    abstract void a();

}

abstract class art extends music {
    abstract void b();

    void a() {
        System.out.println("aaaa");
    }
}

class abcd {
    void b() {

    }
}

public class testt {
    public static void main(String[] args) {
        abcd s = new abcd();
        s.b();

    }
}
