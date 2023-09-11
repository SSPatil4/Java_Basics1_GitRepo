package ForLoop_StringMethods;

public class StringCount {
    public static void main(String[] args) {
        String name = "saurabh patil";
        String rev = "";
        for (int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
    }
}
