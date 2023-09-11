package AA_SelfDemo;

class Aa {
    void m1(){
        System.out.println( "Bb. m1");
    }


}


public class demo7 extends Aa {

    void m1(){
        System.out.println( "Bb. m2");
    }
}

class Bb extends demo7{
    void m1(){
        System.out.println( "Bb. m3");
    }
}
class test{
    public static void main(String[] args) {

        Bb b =new Bb();
        b.m1();
    }
}


