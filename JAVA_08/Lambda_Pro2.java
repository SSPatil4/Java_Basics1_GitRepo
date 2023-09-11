package JAVA_08;

public class Lambda_Pro2 implements para{

    @Override
    public void div(int a, int b) {
        System.out.println("division "+a/b);
    }

    public static void main(String[] args) {
        Lambda_Pro2 ref = new Lambda_Pro2();
        ref.div(100,2);

        //anonymous
        para p = new para(){
            @Override
            public void div (int a,int b){
                System.out.println(a/b);
            }
        };
        p.div(90,2);

        //lambda
        para pp = (int a,int b)->{
            System.out.println(a/b);
        };
        pp.div(80,2);
    }
}
interface para{
    void div(int a,int b);

}
