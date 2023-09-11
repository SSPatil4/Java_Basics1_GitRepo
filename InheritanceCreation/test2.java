package InheritanceCreation;

class lion{

    long a (String s){
        System.out.println("This is lion here"+" "+"simba");
        return 12;


    }
    double b(){
        System.out.println("this is tiger");
        return 45;
    }
}

public class test2 extends lion {

    public static void main(String[]args){
        lion cub = new lion();
        cub.a(" ");
        cub.b();
        lion grass = new lion();
        grass.a("b");

        grass root = new grass();
        root.f(1,"j");
    }


}

class grass extends lion {
 void f(int x,String g){
     System.out.println("here to rule"+" "+"grass");
 }
}
