package InheritanceCreation;

class mathematics {
    void v(String a) {
        System.out.println("this is mathematics class" + " " + a);

    }

    void c(String s) {
        System.out.println("hello this is mathematics" + " " + s);
    }

}

class algebra extends mathematics {

    void d(String g) {
        System.out.println("hello this is algebra" + " " + g);
    }
}

public class test4 {
        public static void main (String[]args){
            mathematics check = new mathematics ();
            check.v("hello");
            check.c("hola");

        }
}

