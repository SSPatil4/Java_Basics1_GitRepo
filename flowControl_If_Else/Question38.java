package flowControl_If_Else;
//Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order
public class Question38 {
    public static void main(String[] args) {
        int n1=1;
        int n2=2;
        int n3=3;
        if(n1<n2&&n2<n3){
            System.out.println("numbers are in increasing order");
        }else{
            System.out.println("numbers are in decreasing order");
        }
    }
}
