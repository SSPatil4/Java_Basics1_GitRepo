package flowControl_If_Else;

import java.util.Scanner;

//Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
//
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
public class Question19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("enter your physics marks");
       int  Physics=sc.nextInt();
        System.out.println("enter your chemistry marks");
        int Chemistry=sc.nextInt();
        System.out.println("enter your biology marks");
        int  Biology=sc.nextInt();
        System.out.println("enter your mathematics marks");
        int Mathematics=sc.nextInt();
        System.out.println("enter your computer marks");
        int Computer=sc.nextInt();
      //  System.out.println("enter your computer marks");

        int total =Physics+Chemistry+Biology+Mathematics+Computer;
        int avg=total/5;
        System.out.println("percentage"+avg);

        if (avg>=90){
            System.out.println("A");
        } else if (avg>=80 )    {
            System.out.println("B");
        } else if (avg >= 70) {
            System.out.println("C");
        } else if (avg >= 60) {
            System.out.println("D");
        }else if (avg>=40){
            System.out.println("E");
        } else if (avg < 40) {
            System.out.println("F");
        }


    }
}
