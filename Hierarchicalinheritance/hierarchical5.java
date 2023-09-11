package Hierarchicalinheritance;


class structure {

    void j(String a) {
        System.out.println("this is parent class" + " " + a);
    }
}

class steel extends structure {
    void k(String b) {
        System.out.println("this is parent class" + " " + b);
    }
}

class rcc  extends structure {
    void l(String c) {
        System.out.println("this is parent class" + " " + c);
    }
}

public class hierarchical5 {
    public static void main (String[]args){
      steel tata = new steel();
      tata.j("tata steel structure");
      tata.k("grade of steel 01");

      rcc cement = new rcc ();
      cement.j("ambuja structure");
      cement.l("asdfgs");
    }
}
