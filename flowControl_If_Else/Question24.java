package flowControl_If_Else;

import java.util.Scanner;

//If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of basic salary.
// If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
// If the employee's salary is input through the keyboard write a program to find his gross salary
public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary");
        int salary=sc.nextInt();
        if(salary<1500){
            System.out.println("gross salary ="+(salary+(0.1*salary)+(0.9*salary)));
        }else{
            System.out.println("gross salary ="+(salary+500+(0.98*salary)));
        }
    }

}
