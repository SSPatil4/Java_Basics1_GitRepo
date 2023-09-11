package InhiritanceQuePractice;

class a
{
    int x;
    void m1() {
        System.out.println(x);
    }

}
class b extends a
{
    int y;
    void m1() {
        System.out.println(y);
    }
}
public class checkQue {
    public static void main(String[] args)
    {
        b cc = new b();
        cc.x = 20;
        cc.y = 30;
        cc.m1();
    }
}
