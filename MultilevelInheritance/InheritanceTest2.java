package MultilevelInheritance;


class boss {
    void v(char a) {
        System.out.println("alphabet name" + " " + a);
    }

}

class ceo extends boss {
    int i(char b) {
        System.out.println("alphabet name" + " " + b);
        return 1;
    }

}

class manager extends ceo {
    void j(char c) {
        System.out.println("alphabet name" + " " + c);

    }

}

class emp extends manager {

}

public class InheritanceTest2 {
    public static void main(String[] args) {
        emp mn = new emp();
        mn.v('A');
        mn.i('B');
        mn.j('C');
    }
}
