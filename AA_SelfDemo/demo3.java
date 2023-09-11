package AA_SelfDemo;

class StaticComponents {
    static int staticVariable;

    static {
        System.out.println("StaticComponents SIB");
        staticVariable = 10;
    }

    static void staticMethod() {
        System.out.println(staticVariable);

        System.out.println("From StaticMethod");
    }
}

public class demo3 extends StaticComponents {
    static {
        System.out.println("MainClass SIB");
    }

    public static void main(String[] args) {
        //Static Members directly accessed with Class Name

        StaticComponents.staticMethod();
        StaticComponents.staticVariable = 20;
        System.out.println(staticVariable);

    }
}
