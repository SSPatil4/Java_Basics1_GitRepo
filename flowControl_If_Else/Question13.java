package flowControl_If_Else;

import java.util.Scanner;

//Write a program to count total number of notes in given amount
public class Question13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("count total number of notes");
        int amount=100;
        int rem=10;
        if(amount/10==rem){
            System.out.println("remainder");
        }

    }
}
