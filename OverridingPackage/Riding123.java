package OverridingPackage;

public class Riding123 {

    Riding123 act(int a){
        System.out.println("hello");
        Riding123 cc =new Riding123();
        return cc;
    }
}
class acting extends Riding123{
    @Override
    acting act(int a){
        System.out.println("hii");
        acting cx = new acting();
        return cx;
    }

    public static void main(String[] args) {
        Riding123 tt = new acting();
        tt.act(4);
    }
}

class sleep{
    sleep three(){
        sleep cc = new sleep ();
        return cc;
    }

}
class play extends sleep{
    play three(){
        play cc = new play ();
        return cc;
    }

}
