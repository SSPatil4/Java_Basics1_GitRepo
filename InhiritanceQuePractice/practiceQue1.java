package InhiritanceQuePractice;


class A
{
    int x;
    void m1() {
        System.out.println(x);
    }
}
 class B extends A
{
    int y;
    void m1() {
        System.out.println(y);
    }
}
 class Test {
    public static void main(String[] args)
    {
        B b = new B();
        b.x = 20;
        b.y = 30;
        b.m1();
    }
}
public class practiceQue1 {

}
