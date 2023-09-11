package MultilevelInheritance;

class rose{
    void a(String a){
        System.out.println("flower name "+" "+a);

    }
}
class lili extends rose{
    void b(String b){
        System.out.println("flower name "+" "+b);
}

}
class jasmine extends lili{
    int c(String c){
        System.out.println("flower name"+" "+c);
        return 01;

    }
}

class sunflower extends jasmine {


}

public class inheritancetest3 {
    public static void main (String[]args){
        sunflower check = new sunflower();
        check.a("rose");
        check.b("lili");
        check.c("sunflower");
    }

}
