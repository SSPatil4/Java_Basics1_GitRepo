package ForLoop_Diagrams;

public class DffLogic {
    public static void main(String[] args) {
        int n = 10;
        for (int i = n; i >= 1; i--) {       //(int i = n; i > 0; i--) or (int i = 1; i <= n; i++)
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
           /* for (int j = i; j > 0; j--){
                System.out.print("* ");
            }*/
            System.out.println();
        }
    }

}
