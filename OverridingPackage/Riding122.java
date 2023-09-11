package OverridingPackage;

public class Riding122 {
    Riding122 abc(){
        System.out.println("this is riding class ");
        Riding122 cc = new Riding122();
        return cc;
    }
    Riding122 bbb(){
        Riding122 cv = new Riding122();
        return cv;
    }

    public static void main(String[] args) {
        Riding122 tt = new rider(); //upcasting
        tt.abc();
        tt.bbb();
    }
}

class rider extends Riding122{

    @Override
    Riding122 abc() {
        return super.abc();
    }

    @Override
    Riding122 bbb() {
        return bbb();
    }
}

