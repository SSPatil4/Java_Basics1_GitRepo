package ForLoop_StringMethods;
// reverse printed
public class prog5 {

public static void main (String[]args){
    String str = "   saurabh";
    String reverse ="";
    for (int i=1;i<str.length();i++){
        char ch=str.charAt(i);
        reverse=ch+reverse;
    }
    System.out.println("print in reverse dirn ="+str.trim()+" "+reverse);

}
}
