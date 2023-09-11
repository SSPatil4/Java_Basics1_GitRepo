package encapPackage1;

public  class firstClass01 {
    static private void army(String name) {
        System.out.println("this is army class =" + name);

    }

    public static void main(String[] args) {
        firstClass01 ck = new firstClass01();
        ck.army("Indian Army");
        ck.add(4, 3);

        navyseal obj = new navyseal();
        obj.add(1, 2);
    }

    void add(int a, int b) {
        System.out.println("normal method add " + (a + b));
    }


}


class navyseal {
    void add(int a, int b) {
        System.out.println("override of add from navy " + (a + b));
    }
}
