package flowControl_If_Else;
//Write a program to input angles of a triangle and check whether triangle is valid or not
public class Question14 {
    public static void main(String[] args) {
        int angle1=30;
        int angle2=60;
        int angle3=90;
        if(angle1+angle2+angle3==180){
            System.out.println("the triangle is valid ");
        }else{
            System.out.println("not valid triangle");
        }

    }
}
