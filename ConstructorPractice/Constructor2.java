package ConstructorPractice;

class army {
    army() {
        this(9);
        System.out.println("this is army class");
    }

    army(int a) {
        System.out.println("army class one para");
    }

    army(int b, int c) {
        this(4, 5, 6);
        System.out.println("army class two para");

    }

    army(int d, int e, int f) {
        this();
        System.out.println("army class three para");
    }
}

class navy extends army {
    navy() {
        super('h', 'y');
        System.out.println("this is navy class");
    }

    navy(char a) {
        this();
        System.out.println("navy class one para");
    }

    navy(char b, char c) {
        this('B');
        System.out.println("navy class two para");
    }

    navy(char d, char e, char f) {
        this('S');
        System.out.println("navy class three para");
    }
}

class air extends navy {
    air() {
        this(20, 30);
        System.out.println("this is air class");
    }

    air(int a) {
        super('i', 'l', 'u');
        System.out.println("air class one para");
    }

    air(int b, int c) {
        this(7);
        System.out.println("navy class two para");
    }
}

class para extends air {
    para() {
        this(99);
        System.out.println("this is para class");
    }

    para(int mark) {
        this(982230735l);
        System.out.println("para class one para");
    }

    para(long l) {
        super();
        System.out.println("para class");
    }

    void v(char m) {
        System.out.println("this is character" + " " + m);
    }
}


public class Constructor2 extends para {

    public static void main(String[] args) {
        para cc = new para();
        cc.v('S');

    }

}
