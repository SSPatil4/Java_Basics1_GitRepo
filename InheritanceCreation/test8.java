package InheritanceCreation;

public class test8 {
    int a=10,b=20;
    void add(int c,int d){
       // int c=11;int d=12;
        int result1=c-d;
        int result=a+b;
        System.out.println("print sub of c&d="+result1);
        System.out.println("print addition ="+result);
    }
    void mul(int a,int b){
        System.out.println("print mul of "+(a*b));
    }
}
class ssss extends test8{
    @Override
    void mul(int a,int b){
        System.out.println("override mul");
    }
    void sub(int a,int b){
        System.out.println("print sub of "+(a-b));
    }

    @Override
    void add(int c, int d) {
        super.add(c, d);
        System.out.println("child did overriding"+(c+d));
    }

    public static void main(String[] args) {

        test8 obj = new ssss();
        obj.add(3,1);
        obj.mul(4,5);


        ssss ob1=new ssss();
        obj.add(11,12);
        ob1.sub(10,9);
        ob1.mul(6,5);


    }

}
