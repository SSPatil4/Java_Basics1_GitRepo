package flowControl_If_Else;
//Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter.
// For example, the area of the rectangle with length = 5 and breadth = 4 is greater than its perimeter
public class Question32 {
    public static void main(String[] args) {


        int l = 5;
        int b = 4;
      //  int area = l * b;
        //int perimeter=(2*(l+b))
        if ((l * b) > (2 * (l + b))) {
            System.out.println("area is grater than perimeter");
        }else {
            System.out.println("otherwise");
        }
    }
}