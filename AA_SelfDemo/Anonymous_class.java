package AA_SelfDemo;


interface trapezoid{
    public abstract void play();
}
public class Anonymous_class {
    public void createClass(){
        trapezoid obj = new trapezoid(){
            @Override
               public void play(){
            System.out.println("inside anno class ");
        }
    };
        obj.play();
    }
}

class main{
    public static void main(String []args){
        Anonymous_class a = new Anonymous_class();
        a.createClass();
    }
}


//practice

/*interface testing{
    void run();
}
class test21{
    public void createClass() {
        testing ref = new testing() {
            @Override
            public void run() {
                System.out.println("inside run overriding");
            }
        };
        ref.run();
    }

    public static void main(String[] args) {
        test21 obj = new test21();
        obj.createClass();
    }

}*/
