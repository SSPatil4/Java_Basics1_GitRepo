package ExceptionCompiletime;

import java.util.Scanner;

public class multipleCatch {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your number");
        try {
            int n = Integer.parseInt(scn.nextLine());

            if (99 % n == 0) {
                System.out.println(n + " is a factor of 99");
            } else {
                System.out.println("print else");
            }
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic " + ex);
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception " + ex);
        }
    }
}

