package flowControl_If_Else;

public class Que21Optional {
    public static void main(String[] args) {
        int units=305;
        double billpay=0;
        if(units<100){
            billpay=units*1.2;
        }else if (units<300){
            billpay=((100*1.2)+(units-200));
        } else if (units > 300) {
            billpay=(((100*1.2)+(200*2)+(units-300)*3));
        }
        System.out.println("bill to pay "+billpay);
    }
}
