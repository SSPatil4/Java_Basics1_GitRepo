package ForLoop_StringMethods;
////print reverse
public class prog3 {
    public static void main(String[] args) {
        String kk = "elephant";
        String rev ="";
        for (int i=kk.length()-1;i>=0;--i){
            char ch = kk.charAt(i);
            rev = rev+ch;
        }
        System.out.println("print in reverse ="+rev);
    }
}
