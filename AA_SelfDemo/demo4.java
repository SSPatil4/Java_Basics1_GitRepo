package AA_SelfDemo;

public interface demo4 {
    void m();
}

interface b {
    void m2();
}

interface c extends b, demo4 {
    void m1();
}

class a implements c, b, demo4 {
    @Override
    public void m2() {

    }

    @Override
    public void m() {

    }

    @Override
    public void m1() {

    }
}

class hurray {
    public static void main(String[] args) {
        a obj = new a();
        obj.m();
        obj.m1();
        obj.m2();
    }
}
