package OverloadingPackage;


public class over1 {
     void first(int a) {
        System.out.println("first class with one para ");
    }

  void first(int a, int b) {
        System.out.println("first class with two para");
    }

    int first(int a, int b, int c) {
        System.out.println("first class with three para"+a +b +c);
        return 1;
    }

    void second(int a) {
        System.out.println("second class with one para");
    }

    void second(int a, int b) {
        System.out.println("second class with two para");
    }

    void second(int a, int b, int c) {
        System.out.println("second class with three para");
    }

    public static void main(String[] args) {
        over1 cc = new over1();
        cc.first(1);
        cc.first(2, 3);
        cc.first(4, 5, 6);
        cc.second(9);
        cc.second(8, 7);
        cc.second(6, 5, 4);
    }

}
