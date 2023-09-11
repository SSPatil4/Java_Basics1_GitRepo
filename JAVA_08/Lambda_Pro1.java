package JAVA_08;
@FunctionalInterface
interface army{
    int play(int a,int b);
}
public class Lambda_Pro1 implements army{
    @Override
    public int play(int a, int b) {
        int sum = a+b;

        return sum;
    }

    public static void main(String[] args) {
        Lambda_Pro1 ref = new Lambda_Pro1();
        System.out.println(ref.play(0,1));

        //anonymous
        army a = new army(){
            @Override
            public int play(int a,int b){
                System.out.println("ano print ");
                return a+b;
            }

        };
        System.out.println(a.play(0,2));

        //lambda
        army aa = (int c,int b) -> {

            System.out.println("lambda");
            return c+b;
        };
        System.out.println( aa.play(0,3));
    }
}
