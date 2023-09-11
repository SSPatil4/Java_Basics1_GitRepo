package ExceptionsRuntime;

public class Null_Pointer_exce {
    static void call(){

        String name = null;
        System.out.println(name.length());


    }
    public static void main(String []args){

        call();
    }


}
