package ForLoop_Diagrams;

public class number_patt2 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1,p=0;i<n;i++,p+=2){
            for (int j=i;j<=n;j++){
                System.out.print("  ");
            }for (int j=1;j<=i;j++){
                System.out.print(p+" ");
            }for (int j=1;j<i;j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }

    for (int i=1,p=8;i<=n;i++,p-=2){
        for (int j=1;j<=i;j++){
            System.out.print("  ");
        }for (int j=i;j<=n;j++){
            System.out.print(p+" ");
        }for (int j=i;j<n;j++){
            System.out.print(p+" ");
        }
        System.out.println();
    }
}}

