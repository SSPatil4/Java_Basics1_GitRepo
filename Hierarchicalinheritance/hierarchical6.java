package Hierarchicalinheritance;

class earth {
    void a (){
        System.out.println("aaaaa");
    }
}

class ocean extends earth {
    void s(){
        System.out.println("bbbb");
    }
}
class continents extends earth {
    void d (){
        System.out.println("cccc");
    }
}
public class hierarchical6 {

    public static void main(String[] args) {
        ocean pacific = new ocean();
        pacific.s();
        pacific.a();
        continents asia = new continents();
        asia.d();
        asia.a();
    }
}
