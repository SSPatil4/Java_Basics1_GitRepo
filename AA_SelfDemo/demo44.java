package AA_SelfDemo;

public class demo44 {
}

class Myclass{
   /* private int x = 10;
    static int m1() {
        int y = x;
        return y;}*/

    private int x = 10;
    static int m1()
    {
        Myclass obj = new Myclass();
        int y = obj.x;
        return y;
    }
    public static void main(String[] args) {
            m1();
        /*int n=5;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
//            for(int j=i;j<=n; j++){
//                System.out.print(" * ");
//            }
            System.out.println();*/

        }
    }

