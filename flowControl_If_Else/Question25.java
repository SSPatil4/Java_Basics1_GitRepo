package flowControl_If_Else;

import java.util.Scanner;

/*The marks obtained by a student in 5 different subjects are input through the keyboard.
The student gets a division as per the following rules: Write a program to calculate the division obtained by the student

Percentage above or equal to 60 - First division
Percentage between 50 and 59 - Second division
Percentage between 40 and 49 - Third division
Percentage less than 40 – Fail*/
public class Question25 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter subject 1 marks");
        double s1;
        s1=sc.nextDouble();
        System.out.println("enter subject 2 marks");
        double s2;
        s2=sc.nextDouble();
        System.out.println("enter subject 3 marks");
        double s3;
        s3=sc.nextDouble();
        System.out.println("enter subject 4 marks");
        double s4;
        s4=sc.nextDouble();
        System.out.println("enter subject 5 marks");
        double s5;
        s5=sc.nextDouble();
        double total=(s1+s2+s3+s4+s5);
        double avg = total/5;
       // int n=10;
      //  int i=0;
        //for (i=0;i<=10;i++){
      if(avg>=60){
          System.out.println("first division");
      } else if (avg>50 && avg<=59) {
          System.out.println("second division");
      }else if (avg>40 && avg<=49){
          System.out.println("third division");
      }else {
          System.out.println("fails");
      }
    }

}
