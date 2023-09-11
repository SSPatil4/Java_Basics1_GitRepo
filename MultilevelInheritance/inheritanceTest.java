package MultilevelInheritance;


class grandfather{
    void meth1(String a){
        System.out.println("this is grandfather class"+" "+a);
    }

}
class father extends grandfather {
    int meth2(String b){
        System.out.println("this is father class"+" "+b);
        return 01;
    }

}
class child extends father {
    long l(String c){
        System.out.println("this is child class"+" "+c);
        return 21;
    }

}
class grandchild extends child {
    void v(String d){
        System.out.println("i am grandchild"+" "+d);

    }

}
public class inheritanceTest {

    public static void main (String []args){
        grandchild gc = new grandchild();
        gc.meth1("Prabhakarrao");
        gc.meth2("Shankar");
        gc.l("saurabh");
    }


}
