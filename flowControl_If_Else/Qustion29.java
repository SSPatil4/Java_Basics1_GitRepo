package flowControl_If_Else;
//If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three
public class Qustion29 {
    public static void main(String[] args) {
        int a=3;
        int b=1;
        int c=2;
        if(a<b&&a<c){
            System.out.println("a is young");
        }else if(b<a&&b<c){
            System.out.println("b is young");
        }else {
            System.out.println("c is young");
        }
    }
}
