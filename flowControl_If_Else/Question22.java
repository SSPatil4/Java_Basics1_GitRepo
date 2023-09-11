package flowControl_If_Else;
// while purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100.
//If quantity and price per item are input through the keyboard, write a program to calculate the total expenses
public class Question22 {
    public static void main(String[] args) {
        int qty=300;
        int prz=5;
      //  int disc=0.1;
        if(qty<100){
            System.out.println("the prize/expense ="+qty*prz);
        } else {
            System.out.println("the prize/expense ="+((qty*prz)-((qty*prz)*0.1)));
        }
    }
}
