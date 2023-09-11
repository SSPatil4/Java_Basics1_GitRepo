package AA_SelfDemo;

public class String_Methods {
    public static void main (String [] args) {
        String str = "saurabh";
        String str1 = new String("saurabh");
        String s = "saurabh";
        System.out.println(s == str1); //false
        System.out.println(s.equals(str1)); // true
        System.out.println(str.indexOf('s',0));
        System.out.println(str.indexOf("s"));
        System.out.println(str.replace("bh","v"));

    }
}
