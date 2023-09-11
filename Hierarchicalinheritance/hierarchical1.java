package Hierarchicalinheritance;
class parent {
    void j(String a){
        System.out.println("this is parent class"+" "+a);

    }
}
class child1 extends parent{
    void k (String b){
        System.out.println("child class"+" "+b);
    }
}

class child2 extends parent {
    void l(String c){
        System.out.println("hello"+" "+c);
    }

}


public class hierarchical1 {

    public static void main (String[]args){
        child2 v = new child2 ();
        v.j("spp");
        v.l("bsp");
        child1 s = new child1 ();
        s.j("spp");
        s.k("bsp");
    }
}
