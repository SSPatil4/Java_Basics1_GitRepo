package ForLoop_StringMethods;

public class forloop6 {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }for(int s=1;s<=i;s++){
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
