package StringLiterals;
// heap memory and string constant pool
public class prog1 {
    public static void main(String[] args) {
        String st = new String("saurabh");
        String st1 = new String("saurabh");
        String s= "saurabh";
        String s1="Saurabh";
        System.out.println(s==s1); //f
        System.out.println(s==st); //f
        System.out.println(st==st1); //f
        System.out.println(s.equals(s1)); //f
        System.out.println(s.equals(st)); //t
        System.out.println(s1.equals(st1)); //f
    }
}
