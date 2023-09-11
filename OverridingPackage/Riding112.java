package OverridingPackage;
class company{
    company one(){
        company check = new company();
        return check;
    }
    company two(){
        company cc = new company();
        return cc;
    }
}
public class Riding112 extends company {
    @Override
    company one() {
        return one();
    }

    @Override
    company two() {
        return two();
    }

    public static void main(String[] args) {
        company tt = new Riding112();
        tt.one();
        tt.two();
    }
}
