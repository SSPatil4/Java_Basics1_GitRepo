package ExceptionsRuntime;

import com.sun.security.jgss.GSSUtil;

public class multiCatch {
    public static void main (String []args){

       try {
            int [] arr = new int[10];

            try{
                arr [10]=20;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("nested try exception caught");
                e.printStackTrace();
            }
           arr [7]=10/0;
        }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array exception");
           e.printStackTrace();
        }catch(ArithmeticException e){
           e.printStackTrace();
           System.out.println("Arithmetic exception");


       }catch (RuntimeException e){
           System.out.println("Runtime Exception found");
           e.printStackTrace();
       }
        System.out.println("print if exception handled well");

    }
}


