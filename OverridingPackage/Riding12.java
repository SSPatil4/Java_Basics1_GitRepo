package OverridingPackage;
class lion{
    lion one(int a){
        lion cc = new lion();
        System.out.println("this is parent "+a);
        return cc;
    }
}
public class Riding12 extends lion{
    @Override
    lion one(int a){
        lion cx = new lion();
        System.out.println("this is child class "+a);
        return cx;
    }

    public static void main(String[] args) {
        lion tt = new Riding12();
        tt.one(1);
        lion cx = new lion();
        cx.one(2);
    }
}
