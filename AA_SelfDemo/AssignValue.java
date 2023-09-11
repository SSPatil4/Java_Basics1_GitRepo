package AA_SelfDemo;

public class AssignValue {

    /*private*/ AssignValue(){
        System.out.println("1001");
    }
    /*public static void main(String[] args) {
        int a=20;
        int b=30;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a = "+a);
        System.out.println("value of b = "+b);

        int c=10;
        int d=20;
        int e=c+d;
        c=e-c;    //20
        d=e-d;      //10
        System.out.println("value of c="+c);
        System.out.println("value of d="+d);

        int f=10,g=20,h=30;



    }*/
}
class helojava extends AssignValue{
    helojava(){
        super();
        System.out.println("101");
    }

    public static void main(String[] args) {
        helojava o = new helojava();
    }

}
