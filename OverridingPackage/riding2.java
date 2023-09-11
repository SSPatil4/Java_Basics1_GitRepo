package OverridingPackage;

class second {
    int add(int a, int b) {
        return a+b;
    }
}

class third extends second {
    @Override
    int add(int a, int b) {
        int c = a+b;
        System.out.println("print third class's ans "+ c);
        return c;
    }
}

class forth extends third {
    @Override
    int add(int a, int b) {
        System.out.println("print forth class's ans ");
        return a+b+200;
    }
}

public class riding2 {
    public static void main(String[] args) {
        second cc =new forth();
     int ans =  cc.add(1,2);
        System.out.println("print result "+ans);

        second ck = new third ();
        ck.add(4,5);



    }

}
