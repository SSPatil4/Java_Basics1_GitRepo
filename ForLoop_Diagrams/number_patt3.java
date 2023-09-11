package ForLoop_Diagrams;

public class number_patt3 {

    public static void main(String[] args) {
        int n=7;
        for (int i=1;i<=n;i++ ){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print("2 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

}
