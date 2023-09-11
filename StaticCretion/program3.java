package StaticCretion;

//check for static if works
public class program3 {
    int instanceAge = 50;

    static int no = 100;

    static {
        no = 100;
        System.out.println("SIB of class " + no /*+ instanceAge*/);   //normal or instance variable doesn't call in static block
        add();
//        sub();    normal or instance method doesn't call in static block

    }

    {
        System.out.println("IIB of class " + no + instanceAge);
    }

    static void add() {
        //  this.age();
        System.out.println("static method " + no /*+ instanceAge*/);
        eat();
/*
        sub();  // normal or instance method doesn't call in static method
*/
        program3.eat();

    }

    static void eat() {
        //this.add();
        System.out.println("static method " + no /*+ instanceAge*/);

    }

    void sub() {
        System.out.println("Sub method " + no + instanceAge);
        add();   // static method gets called in instance method

    }

    static class TestOne {

        void multiply() {
            System.out.println("method of inner class " + no /*+ instanceAge*/);
        }

    }


}

class SubProgram extends program3 {



   /* public static void main(String[] args) {
        program3 obj = new program3();
        obj.add();
        SubProgram ob = new SubProgram();
        ob.add();

    }*/

    void show() {
        add();
    }
}

// Static Initialization Block is used to initialize only static variables

class StaticComponents
{
    static int staticVariable;

    static
    {
        System.out.println("StaticComponents SIB");
        staticVariable = 10;
    }

    static void staticMethod()
    {
        System.out.println("From StaticMethod");
        System.out.println(staticVariable);
    }
}
 class MainClass
{
    static
    {
        System.out.println("MainClass SIB");
    }

    public static void main(String[] args)
    {
        //Static Members directly accessed with Class Name
        StaticComponents.staticVariable = 20;
        StaticComponents.staticMethod();
    }
}
