package flowControl_If_Else;
//Write a program to calculate profit or loss
public class Question18 {
    public static void main(String[] args) {
        int sp=100;
        int cp=40;
        int profit=sp-cp;
        if(profit>cp){
            System.out.println("profit is made ");
        } else if (profit < cp) {
            System.out.println("loss is made");
        }
    }
}
