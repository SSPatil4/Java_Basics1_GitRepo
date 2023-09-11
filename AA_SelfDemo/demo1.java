package AA_SelfDemo;
class Parent{


    final int acc=1212;
    static int no;

     void view(){
         no=90;
         System.out.println(no);
        this.view();
         System.out.println(acc);
        System.out.println("this is a parent class method"+acc);
    }
    static void show(){
         no=100;
        System.out.println(no);
        System.out.println("static method of parent");
    }



}
class Child extends Parent {

    void view() {
        super.view();
        System.out.println("this is a child class method");
    }

    void view(int a) {
        System.out.println("parent class second meth");
    }


}
public class demo1 {
    public static void main(String args[]) {
//        Parent ob = new Parent();
//        ob.view();
        Parent.show();
        Parent ob1 = new Child(); // this is upcasting or natural casting
        ob1.view();

//        Child ob2 = (Child) new Parent();  // down-casting doesn't support
//          ob2.view();


    }
}

