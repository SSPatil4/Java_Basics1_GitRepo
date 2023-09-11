package MultilevelInheritance;


class planet {
    double d(String a) {
        System.out.println("This is planet" + " " + a);
        return 6589;
    }

}

class continent extends planet {
    long l(String b) {
        System.out.println("this is continent" + " " + b);
        return 4547;

    }
}

class nations extends continent {
    int p(String c) {
        System.out.println("nation name" + " " + c);
        return 1;

    }

}

class sates extends nations {
    boolean o(String d) {
        System.out.println("this is state" + " " + d);
        return true;
    }

}


public class inheritanceTest6 {
    public static void main(String[] args) {
        sates check = new sates();
        check.d("Earth");
        check.l("Asia");
        check.p("India");
        check.o("Maharashtra");

    }

}