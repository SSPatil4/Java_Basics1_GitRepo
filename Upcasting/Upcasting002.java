package Upcasting;
class army{
    army(){
        System.out.println("this is default constructor of army class");
    }
    void b(String name){
        System.out.println("print ss"+" "+name);
    }
}
class navy extends army{
    navy(){
        System.out.println("this is default constructor of army class");
    }
    void c(String add){
        System.out.println("print ss"+" "+add);
    }

}
class para extends navy{
    para(){
        System.out.println("this is default constructor of army class");
    }


}

public class Upcasting002 extends para{

    void a (){
        System.out.println("print ss");
    }

    public static void main(String[]args){
        //reference type = object type
        army  obj = new navy ();
        navy cc = (navy)new army();

    }
}
