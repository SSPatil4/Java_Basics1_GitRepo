package Upcasting;

class ram {
    void Z() {
        System.out.println("hello Ram");
    }
}

class lax extends ram {
    void X() {
        System.out.println("hello lax");
    }
    void Q() {
        System.out.println("hello laxxx");
    }
}

class sita extends ram {


    void C() {
        System.out.println("hello Sita");
    }
}

public class upcasting3 {


    public static void main(String[] args) {
        //this is an example of upcasting aka(natural casting)
        ram cc = new lax();
        cc.Z();
        ram ccc = new sita();
        ccc.Z();
        //this is an example of down casting aka(un-natural casting)
        //refrence type = object type
        //child = parent
        lax cv = (lax) new ram();
        sita cx = (sita) new ram();

    }
}
