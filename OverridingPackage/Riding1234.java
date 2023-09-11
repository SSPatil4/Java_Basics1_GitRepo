package OverridingPackage;


class eatng {
    eatng one(String a){
        eatng cc = new eatng();
        System.out.println("print hello "+a);
        return cc;
    }
}
class runn extends eatng{
    @Override
    runn one(String a){
        System.out.println("print hello "+a);
        runn cc = new runn();
        return cc;
    }
}
public class Riding1234  {
    public static void main(String[] args) {
        eatng cc = new eatng();
        cc.one("saurabh");
    }
}
