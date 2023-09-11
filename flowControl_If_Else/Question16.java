package flowControl_If_Else;
//Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
public class Question16 {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        int z=2; // if we put z=1 then it's an equilateral triangle
        if(x==y&&y==z){
            System.out.println("triangle is equilateral");
        } else if (x==y&&(x!=z)) {
            System.out.println("triangle is isosceles");
        }else {
            System.out.println("scalene triangle");
        }
    }
}
