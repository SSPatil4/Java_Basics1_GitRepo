package AA_SelfDemo;

import java.util.Iterator;

public class demo5 {

  static int a=1;
    void how(){
        System.out.println("abcd "+a);
    }
  static  void meth(){
      System.out.println("abcd");
  }
    private class saurabh{}
   demo5(){}
}
class demo66 extends demo5{

    @Override
    void how() {
        super.how();
    }

    void add(){
        System.out.println("hiiii "+a);
    }

//static void meth(){
//    System.out.println("abcd");
//}



    public static void main(String[] args) {
        demo66 ob = new demo66();
       ob.how();



    }
}
