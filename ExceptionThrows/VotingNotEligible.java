package ExceptionThrows;

import java.util.Scanner;

public class VotingNotEligible extends RuntimeException{
    VotingNotEligible(String msg){
        super(msg);
    }


}
class TestingJJ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age ");
        int age=sc.nextInt();
        if (age>18){
            System.out.println("eligible for voting ");
        }else{

             throw new  VotingNotEligible("\"not eligible for voting  \"");
        }


    }

}
