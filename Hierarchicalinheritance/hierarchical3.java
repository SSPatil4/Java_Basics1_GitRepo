package Hierarchicalinheritance;

class birds {
    void a (String p){
        System.out.println("class of birds"+" "+p);
    }
}

class peacock extends birds {
    void b (String o){
        System.out.println("puuu"+" "+o);
    }
}

class eagle extends birds {
    void c (String i){
        System.out.println("chii"+" "+i);
    }
}
public class hierarchical3 {

    public static void main (String [] args){
        peacock king = new peacock();
        king.b("is my voice");
        king.a("main class");

        eagle king2 = new eagle ();
        king2.a("main class");
        king2.c("is my voice");
    }
}
