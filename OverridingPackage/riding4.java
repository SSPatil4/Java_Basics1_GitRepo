package OverridingPackage;
class army {
    void a(int a,int b){
        System.out.println("army class "+(a-b));
    }
}
class navy extends army{
    @Override
    void a(int a,int b){
        System.out.println("navy class "+(a-b)*10);
    }

    public static void main(String[] args) {
        army cc = new navy(); //this is upcasting it works here
        cc.a(2,3);
        navy ck =new navy();
        ck.a(5,4);
        navy cx = (navy) new army(); //downcasting is tried here for understanding only it cannot execute
        cx.a(3,2);

    }

}
public class riding4 {
}
