package SIB_IIBCreation;

public class mixProg2 {
    void add(){
        System.out.println("normal method");
    }
    static void sub(){
        System.out.println("static method printed ");
    }
    {
        System.out.println("instsnce block printed ");
    }
    static{
        System.out.println("here is static block ");
    }
    mixProg2(){
        System.out.println("constructer is here ");
    }

    public static void main(String[] args) {
        mixProg2 cc = new mixProg2();
        sub();
        System.out.println("main meth printed ");
        cc.add();
    }
}
