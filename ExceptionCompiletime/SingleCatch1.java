package ExceptionCompiletime;

import java.util.Scanner;

public class SingleCatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input here");

        try {
            int no= Integer.parseInt(sc.nextLine());
            if (100 % no ==0){
                System.out.println(no +"is a factor of 100");
            } else{
                System.out.println(no+"is not a factor of 100");
            }
        } catch(ArithmeticException | NumberFormatException e){
            e.printStackTrace();
        }
    }
}
