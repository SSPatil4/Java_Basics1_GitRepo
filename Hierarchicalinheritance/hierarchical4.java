package Hierarchicalinheritance;

class apple {
    void a (int a){
        System.out.println("im apple"+" "+a);
    }
}

class watch extends apple {
    void s (int b ){
        System.out.println("series1");
    }
}

class ipad extends apple{

}
public class hierarchical4 {

    public static void main (String [] args){
        watch ss = new watch();
        ss.a(001);
        ss.s(01);

        ipad pp = new ipad();
        pp.a(11);
    }
}
