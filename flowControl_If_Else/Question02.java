package flowControl_If_Else;
//Write a program to find maximum between three numbers

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        if (num1 > num2 && num1 > num3) {
            System.out.println("num 1 is max");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num 2 is max");
        } else {
            System.out.println("num 3 is max");
        }
    }
}
 class one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,max =0;
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        num1=max;
        if (num2>max){

            max=num2;
        }if (num3>max){
            max=num3;
        }
        System.out.println("print max no "+max);

    }
}
