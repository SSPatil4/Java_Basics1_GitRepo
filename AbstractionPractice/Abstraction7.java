package AbstractionPractice;

abstract class  abc{
    void j(int a,int b){
        System.out.println("addition of a,b"+" "+a+" "+b);
    }
}
abstract class def extends abc{
    void k(int c,int d){
        System.out.println("subtraction of c,d"+" "+c+" "+d);

    }
}
abstract class ghi extends def{
    void l(int e,int f){
        System.out.println("multiplication of e,f"+" "+e+" "+f);
    }
    abstract void o(String a);

}
class qwe extends ghi{
    void m(){
        System.out.println("print hello");
    }
    void o(String o){
        System.out.println("this is implementation of class ghi"+" "+o);
    }
}
public class Abstraction7 {
    public static void main(String[]args){
        qwe check = new qwe();
        check.m();
        check.l(127,-128);
        check.j(1,2);
        check.k(4,5);
    }
}
