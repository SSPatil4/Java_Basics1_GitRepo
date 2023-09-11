package ExceptionCompiletime;

import java.util.Scanner;

public class singleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        try {
            int n = Integer.parseInt(sc.nextLine());
            if (50 % n == 0) {
                System.out.println(n + "is a factor of 50 ");
            } else {
                System.out.println("is not factor of 50");
            }

        } catch ( ArithmeticException | NumberFormatException e) {
            System.out.println("exception name is " + e);

        }
    }
}
