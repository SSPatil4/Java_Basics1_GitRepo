package ForLoop_StringMethods;
// reverse print
public class prog {
    public static void main(String[] args) {
        String name = "Saurabh Patil";
        String reverse = "";
        for (int i = 1; i<name.length();i++){
            char ch = name.charAt(i);
            reverse = ch+reverse;

        }
        System.out.println("print the name in reverse order ="+reverse);


    }

}
