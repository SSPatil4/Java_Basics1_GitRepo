package ExceptionThrows;

import java.util.Scanner;

public class AtmPinException extends RuntimeException{
    AtmPinException(String msg){
        super(msg);
    }
}
class Testkk{
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        System.out.println("enter your pin");
        int pin = ref.nextInt();
        if (pin >0000&&pin<9999){
            System.out.println("valid pin");
        }else{
           throw new AtmPinException("invalid pin");
        }

    }
}
