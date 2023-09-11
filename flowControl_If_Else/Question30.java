package flowControl_If_Else;
//Write a program to check whether a triangle is valid or not, when the three angles of
// the triangle are entered through the keyboard. A triangle is valid if the sum of all the three angles is equal to 180 degrees
public class Question30 {
    public static void main(String[] args) {
       // int angle=180;
        int a1=60;
        int a2=60;
        int a3=60;
        if(a1+a2+a3==180){
            System.out.println("valid triangle");
        }else{
            System.out.println("not valid");
        }
    }
}
