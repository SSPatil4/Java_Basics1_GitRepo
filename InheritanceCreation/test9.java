package InheritanceCreation;

class birds {

    int a = 10, b = 20;

     void add() {
        System.out.println("this is first meth");
    }

    static void addition() {
        System.out.println("static method of addition of birds class");
    }

    static {
        System.out.println("this is SIB");
    }

    {
        System.out.println("this is IIB");
    }

}

abstract class eagle extends birds {
    @Override
     void add() {
        super.add();
        System.out.println("this is override of method add in bird class ");
    }

    public int a = 1, b = 2;

    void sub() {
        System.out.println("this is sub meth of abstract eagle class");
    }

    static void subtraction() {
        System.out.println("static method of substraction meth of abstract class eagle");
    }

    static {
        System.out.println("this is SIB of abstract class");

    }


    {

        System.out.println("this is IIB of abstract class");
    }

    abstract void subb();   //abstract method


    eagle() {
        System.out.println("this is constructor of abstract class");
    }


}

class peacock extends eagle implements sparrow {
    @Override
    public void per() { }

    @Override
    void subb() {
        System.out.println("this is override subb");

    }

    @Override
    public void div() {
        System.out.println("this is override of div meth of interface sparrow");
    }
}

interface sparrow {
     void per();

    int aa = 10;

    public void div();    // method in interface is always public

    // sparrow(){}        // constructor is not allowed in interface
    static void mul() {
        System.out.println("this is static method of interface sparrow");
    }


// SIB and IIB is not allowed in interface but why?

}

interface parrot extends sparrow {
    public void division();
}


public class test9 {
    public static void main(String[] args) {
        peacock ob = new peacock();
        ob.sub();
       ob.add();
        ob.subb();
        ob.div();
        ob.per();

        birds.addition();

        eagle.subtraction();
        eagle.addition();

      //  peacock ob1 = new peacock();   //peacock is a normal class so all the sib and iib and constructor are called just with the creation of object of...



    }


}
