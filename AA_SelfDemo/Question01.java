package AA_SelfDemo;

class z {
    int x;

    void m1() {
        System.out.println(x);
    }
}
class y extends z {
    int y;

    void m1() {
        super.x = y - 1;
        System.out.println(y + " " + x);
    }
}
public class Question01 {
    public static void main(String[] args) {
        y b = new y();
        b.x = 20;
        b.y = 30;
        b.m1();
    }
}
