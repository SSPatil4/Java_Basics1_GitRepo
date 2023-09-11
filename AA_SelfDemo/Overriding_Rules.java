package AA_SelfDemo;

import java.util.HashMap;
import java.util.Map;

public class Overriding_Rules {

    static int no;
    final int num=3456;
//     void m1() {
//        System.out.println("Parent's m1");
//    }   // restrictive access or weaker access

    static void m2() {
        System.out.println("Parent's m2");
    }

}

class ChildOne extends Overriding_Rules {
//    @Override
//    protected void m1() {               //more access or strong access
//        System.out.println("Child's m1");
//
//    }

    static void m2() {
        System.out.println("Child's m2");
    }

    public static void main(String[] args) {

//Map<String,Integer> obj = new HashMap<>();


        Overriding_Rules ob = new ChildOne();   // upcasting
        Overriding_Rules ob1 = new Overriding_Rules();
        ChildOne obj2 = new ChildOne();
//        ob.m1();
        ob1.m2();  //
        //m2();


    }

}
