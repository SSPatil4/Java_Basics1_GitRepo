package MethodCreattion;

public class Steady {
    void S() {
        int a = 45;
        float b = 45;
        float c = a + b;
    }

    void F(float a, float b) {
        float c = a + b;

    }

    int A() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(" enter add:" + c);
        return a + b;

    }

    int B(int a, int b) {
        return 10;

    }

    long h() {
        byte a = 14;
        byte b = 52;
        return a + b;
    }

    long D(int c, int d) {
        return c - d;

    }

    float f() {
        float c = 12f;
        float d = 85f;
        return c * d;

    }

    float g(int a, float b) {
        return a + b;

    }

    double z() {
        float l = 42.1f;
        double k = 45.89;
        return l * k;

    }

    double c(int n, int m) {
        return n * m;

    }

    boolean q() {
        boolean a = true;
        boolean b = false;
        return true;

    }

    boolean w(boolean a, boolean b) {

        return true;

    }

    char ytut(char a) {
        System.out.println("hello" + " " + a);
        return 'b';


    }

    public static void main(String[] args) {
        Steady a = new Steady();
        a.w(true, false);
        a.F(1.2f, 2.5f);
        a.g(19, 04);
        Steady check = new Steady();
        check.ytut('A');


    }


}
