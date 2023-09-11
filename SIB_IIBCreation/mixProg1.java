package SIB_IIBCreation;
class program{
    static {
        System.out.println(123);
    }

    {
        System.out.println("instance block ");
    }
    program(){
        System.out.println("constructor is here ");
    }
    static void add(){
        int a=10;int b=20;
        System.out.println("static method "+(a+b));

    }
    void sub(int a, int b){
      //  program cx =new program();
        System.out.println("normal method "+(a-b));
    }

}
public class mixProg1 extends program{


    public static void main(String[] args) {
        System.out.println("print main method ");
        program cc = new mixProg1();
        cc.sub(10,3);
        add();
    }
}
