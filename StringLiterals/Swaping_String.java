package StringLiterals;

public class Swaping_String {
    public static void main(String[] args) {
        String a="java";
        String b="programming";

        a=a+b;
        b=(a.substring(0,a.length()-b.length()));
        a=a.substring(b.length());

        System.out.println(a+" "+b);


    }
}
