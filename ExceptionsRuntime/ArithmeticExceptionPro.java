package ExceptionsRuntime;
// arithmetic exception

public class ArithmeticExceptionPro {
    int div(int a, int b){

       try {
           System.out.println("hello div meth "+(a/b));
       }catch (Exception e){
           System.out.println("Caught");
       }
        System.out.println("After try catch block");
        return 12;
    }

    public static void main(String[] args) {
        ArithmeticExceptionPro ob = new ArithmeticExceptionPro();
        ob.div(8,0);
        /*int  result = ob.div(10,0);
        System.out.println(result);*/


       /* try {

           int  result = ob.div(10,0);
            System.out.println("print result "+result);


        } catch (ArithmeticException ex){
          //ex.printStackTrace();
          //  System.out.println(ex);
        }*/
        System.out.println("exception handled");





    }




}
