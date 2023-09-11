package Upcasting;

class animals {
    void a(String name) {
        System.out.println("animal class" + " " + name);
    }
}

class aquatic extends animals {

    void dolphin(String name) {

        System.out.println("this is dolphin class" + " " + name);
    }
}

public class Upcasting001 extends aquatic {
    void b(int age) {
        System.out.println("this is ");
    }

    public static void main(String[] args) {

//        aquatic check = new Upcasting001();    //up-casting
//        check.dolphin("pinkyy");
//        check.a("Saurabh S Patil");
        animals ck = new aquatic();         //up-casting
        ck.a("animal name lion");
       // aquatic ckk = (aquatic) new animals();  //down-casting


    }
}
