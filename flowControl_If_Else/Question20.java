package flowControl_If_Else;

import java.util.Scanner;

//Write a program to input basic salary of an employee and calculate its Gross salary according to following:
//
//Basic Salary <= 10000 : HRA = 20%, DA = 80% (gs=10000+2000+8000=20000)
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter basic salary ");
        int bs = sc.nextInt();

        System.out.println("enter hra ");
        double hra = sc.nextDouble();
        hra = bs * (hra / 100);

        System.out.println("enter da ");
        double da = sc.nextDouble();
        da = bs * (da / 100);

        System.out.println("this is gross salary");
        double grossSalary;
        grossSalary = (bs + hra + da);


        if (bs <= 10000) {
            System.out.println("gross salary is equals to " + grossSalary);
        } else if (bs == 10001 && bs <= 20000) {
            System.out.println("gross salary is equals to "+grossSalary);
        } else if (bs > 20000 ) {
            System.out.println("gross salary is equals to "+grossSalary);
        } else {
            System.out.println("salary not credited "+grossSalary);
        }
    }
}

