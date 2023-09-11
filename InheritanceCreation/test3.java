package InheritanceCreation;

class boss{
    float f (String A){
        System.out.println("This is your Boss "+" "+"SAURABH");
        return 12.12f;
    }
}

class manager extends boss {


}
public class test3 extends boss{


    void d (String g,String J){

        System.out.println("hello"+" "+"boss name is ssp"+" "+"he will be here");
    }

    public static void main (String[]args){
        boss emp1 = new boss();
        emp1.f("I am an emp");
        test3 emp2 = new test3();
        emp2.d(" "," ");

    }
}
