package flowControl_If_Else;
// Write a Java program that reads a positive integer and count the number of digits
public class Question37 {
    public static void main(String[]args){
        int count=0,num=-43210;


        if(num>0){
            System.out.println("number is positive integer");
        }else{
            System.out.println("number is negative integer");
        }
        while(num!=0){
            num/=10;
            ++count;

        }
        System.out.println("num of digits ="+count);



    }
}
