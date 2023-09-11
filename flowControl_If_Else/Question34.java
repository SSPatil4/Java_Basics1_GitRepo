package flowControl_If_Else;
// A library charges a fine for every book returned late. For first 5 days the fine is 50 paise,
// for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you return the book after 30
// days your membership will be cancelled. Write a program to accept the number
// of days the member is late to return the book and display the fine or the appropriate mess
public class Question34 {
    public static void main(String[] args) {
        int days=4;
        if(days<=5){
            System.out.println("fine is ="+0.5+"paise");
        }else if (days>5){
            System.out.println("fine is "+5+"Rs");
        }else if (days>30){
            System.out.println(" membership will be cancelled");
        }
    }
}
