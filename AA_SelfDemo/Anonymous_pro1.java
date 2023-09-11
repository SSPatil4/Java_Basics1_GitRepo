package AA_SelfDemo;

public class Anonymous_pro1 {
    public /*int*/ void createClass(){
        triangle t1 =new triangle() {
            @Override
            public void disp() {
                System.out.println("overriding disp ");
            }
        };
        t1.disp();
        /*return 10;*/
    }
    public void createClass1(){
        triangle tr = ()-> {
            System.out.println("hello");
        };tr.disp();
    }
    public static void main(String[] args) {
        Anonymous_pro1 obj = new Anonymous_pro1();
        obj.createClass();
        obj.createClass1();
    }
}

interface triangle{
    void disp();


}
