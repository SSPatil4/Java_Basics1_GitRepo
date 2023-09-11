package flowControl_If_Else;

import java.util.Scanner;

public class scannerProgram {
    public static void main(String[] args) {

//        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("enter first no");
         int num2=sc.nextInt();
        System.out.println("enter second no");
         if(num1>num2){
             System.out.println("num 1 is max");
         }else{
             System.out.println("num 2 is max");
         }
    }



}
