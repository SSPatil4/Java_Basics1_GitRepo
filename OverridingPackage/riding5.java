package OverridingPackage;

public class riding5 {
    void a(int a) {
        System.out.println("class riding5 " + a);
    }
}

class seal extends riding5 {
    @Override
    void a(int a) {
        System.out.println("class seal " + a);
       // return 1;

    }

    public static void main(String[] args) {
        riding5 cx = new seal(); //upcasting
        cx.a(4);
        cx.a(5);
       riding5 c = new riding5();
        c.a(444);
        c.a(44);
        riding5 cc = new tiger();
        cc.a(1);


    }


}
class tiger extends riding5{
    @Override
    void a(int a){
        System.out.println("class tiger "+a);
    }
}
