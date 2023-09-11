package flowControl_If_Else;
// Write a program to input all sides of a triangle and check whether triangle is valid or not

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side 1");
        int s1 = sc.nextInt();
        System.out.println("enter side 2");
        int s2 = sc.nextInt();
        System.out.println("enter side 3");
        int s3 = sc.nextInt();
        if (s1 + s2 >= s3) {
            System.out.println("its a triangle");
        } else {
            System.out.println("not a triangle");
        }
    }
}

