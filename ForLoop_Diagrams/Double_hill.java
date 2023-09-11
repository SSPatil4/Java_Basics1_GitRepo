package ForLoop_Diagrams;

public class Double_hill {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n-1; j++) {
                System.out.print("+");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n - 1; j++) {
                System.out.print("__");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
