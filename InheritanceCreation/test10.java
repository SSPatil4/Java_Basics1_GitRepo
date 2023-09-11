
package InheritanceCreation;

public class test10{
    test10(int a){
        int b;
        System.out.println("test10 is constructor");
    }
}

 class t extends test10{
    t(int b,int c){
        super(10);
        System.out.println("t is constructor ");
    }
 }
class tt extends t{
  tt(){
      super(01,02);
      System.out.println("tt constructor ");

  }
  tt(int d) {
      this();
      System.out.println("this is tt parameter constructor");

  }
  static {
      System.out.println("I am SIB OF CLASS tt");
  }
    {
        System.out.println("i am IIB of class tt");
    }
}

class ttt extends tt{
    ttt(){

        System.out.println("this is ttt constructor ");
    }
    public static void main(String[] args) {
        tt object = new tt(4);
    //    ttt ob = new ttt();

    }

        }