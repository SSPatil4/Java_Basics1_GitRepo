package AA_SelfDemo;

interface Polygon {

    public abstract void display();

}

abstract class polymer {
    public abstract void playing();
}

public class Anonymous_demo {

    public void createClass1() {
        //anonymous class implementing interface
        polymer ref = new polymer() {
            @Override
            public void playing() {
                System.out.println("inside overridden playing ");
            }
        };
        ref.playing();
    }

    public void createClass() {
        //anonymous class implementing interface
        Polygon p1 = new Polygon() {
            @Override
            public void display() {
                System.out.println("Inside an anonymous class");
            }
        };
        p1.display();

    }
}

class Main01 {
    public static void main(String[] args) {
        Anonymous_demo an = new Anonymous_demo();
        an.createClass();
        Anonymous_demo p = new Anonymous_demo();
        p.createClass1();
    }
}