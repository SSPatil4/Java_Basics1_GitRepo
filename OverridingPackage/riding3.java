package OverridingPackage;
 class walk{
    void multi(int a, int b){
        System.out.println("print multiplication "+(a*b));
        return;
    }


}
class run extends walk{
    @Override
    void multi(int a,int b){
       // super.multi(2,3);
        System.out.println("print multiplication "+(a*b+10));
        return ;
    }
}
public class riding3 {
    public static void main(String[] args) {
        walk sl = new walk();
        sl.multi(2,3);

        walk slow = new run(); //upcasting
        slow.multi(2,3);

    }
}
