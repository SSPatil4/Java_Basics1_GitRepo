package flowControl_If_Else;
// Write a program to input any character and check whether it is alphabet, digit or special character
public class Question09 {
    public static void main(String[] args) {
        char alpha='a';
        int digit=1;
         char spchar='@';
         if(alpha<='z'){
             System.out.println(" print char");
         } else if(digit>=0||digit<=0){
             System.out.println("print digit");
         }else{
             System.out.println("print special char ");
         }

    }
}
