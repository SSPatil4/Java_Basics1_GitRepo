package flowControl_If_Else;

import java.util.Scanner;

//Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
//
//For first 50 units Rs. 0.50/unit
//For next 150 units Rs. 0.75/unit
//For next 250 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill
public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter units");
        double units=sc.nextDouble();
        double surcharge=(units*0.20);
      //  System.out.println("enter rs");
       // double rs=sc.nextDouble();
    //    double bill=units*rs;
     //   System.out.println("enter surcharge");
     //   double sur=sc.nextDouble();
       //double surcharge=bill+(bill*sur);
       // System.out.println("surcharge = "+surcharge);
        if (units<50){
            System.out.println("Electricity bill = "+units*0.5);
        }else if(units<=150){
            System.out.println("Electricity bill ="+units*0.75);
        }else if(units<250){
            System.out.println("Electricity bill ="+units*1.2);
        } else if (units>250) {

            System.out.println("Electricity bill ="+((units*1.5)+surcharge));
        }else{
            System.out.println("bill not generated");
        }

    }
}
