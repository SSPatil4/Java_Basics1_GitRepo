package SIB_IIBCreation;
class prog{

    {
        System.out.println("hi this is IIB meth ");
    }

    static {
        System.out.println("here's a static block ");
    }

    prog(){
        System.out.println("constructor is here ");
    }
    int add(int a){
        prog cx = new prog();
        System.out.println("normal meth with one para ");
        return 1;
    }
    static void sub(){
        System.out.println("static method is here ");
    }

}
public class mixProg extends prog{

    public static void main(String[] args) {
        sub();
        prog cc = new prog();
        cc.add(1);
        System.out.println("print main method output ");



    }
}
