package ExceptionsRuntime;
// arithmetic exception
public class arithmeticPro {
    int a=100;
    int b= 0;
    void division(){
        int result = a/b;
        System.out.println("hello division meth "+result);

    }

    public static void main(String[] args) {
        arithmeticPro obj = new arithmeticPro();

        try{
            obj.division();

        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Arithmetic exception handled ");


    }




}
