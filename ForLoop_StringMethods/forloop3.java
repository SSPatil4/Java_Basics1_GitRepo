package ForLoop_StringMethods;

//Program to print in reverse
public class forloop3 {
    public static void main(String[] args) {
        String text = "Program";
        String rev = "";
        for (int i = text.length()-1; i >= 0; i--) {
            char ch = text.charAt(i);
            rev = rev + ch;
        }
        System.out.println("execute i reverse =" + rev);
    }


}
