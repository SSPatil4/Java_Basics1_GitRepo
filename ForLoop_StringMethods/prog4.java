package ForLoop_StringMethods;
//print reverse
public class prog4 {
    public static void main(String[] args) {
        String name = "saurabh shankar patil";
        String reverse = "";
        for (int i=name.length()-1;i>=0;i--){
            char ch = name.charAt(i);
            reverse = reverse+ch;

        }
        System.out.println("print reverse ="+reverse.length()+" "+reverse);
    }
}
