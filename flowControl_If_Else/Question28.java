package flowControl_If_Else;
 //A five-digit number is entered through the keyboard.
         //Write a program to obtain the reversed number and to determine whether the original and reversed numbers are equal or not
public class Question28 {
  public static void main(String[] args) {
      int original=1122;
      int duplicate=original;
      int reverse=0;
      while (original>0){

          reverse=reverse*10+original%10;
          original=original/10;


      }
      System.out.println(reverse);
      System.out.println(duplicate);
      if(reverse==duplicate){
          System.out.println("the original and reversed numbers are equal");
      } else {
          System.out.println("the original and reversed numbers are not equal");

      }
  }
}
