package encapPackage2;

import encapPackage1.*;
import Encapsulation.encap5;


public class secondClass02 extends firstClass01 {

    void add(int a, int b) {
        System.out.println("addition " + (a + b));
    }

    public static void main(String[] args) {
        secondClass02 cc = new secondClass02();
       //  cc.army("this is first class accessed here");
//        cc.add(1,2);
        firstClass01 bb = new secondClass02();
       //   bb.army("this is first class accessed here");



    }
}
// Is_A relation
class Test_encap5 extends encap5{
    public static void main (String [] args ){
        encap5 obj = new encap5();
        obj.setMyName("Saurabh Shankarrao Patil");
        System.out.println("Accessed from encap5 class in another package");
        System.out.println("My name is "+ obj.getMyName());
    }

}
// Has-A relation
class Test_Encap5_Test{
    public static void main (String [] args ){
        encap5 obj = new encap5();
        obj.setEmail("sspatil@gamil.com");
        System.out.println("My email id is "+ obj.getEmail());
    }
}