package StringLiterals;

//// heap memory and string constant pool
public class prog5 {
    static String a;
    final int s = 99;

    public static void main(String[] args) {
        String s = "spp";

        String ss = new String("spp");
        System.out.println(s.hashCode());
        System.out.println(a.hashCode());
        System.out.println(ss.hashCode());
       /* System.out.println(s==a); //true
        System.out.println(s.equals(a)); //true
        String aa = new String("ssp");

        System.out.println(s==ss); //f
        System.out.println(aa==ss); //f
        System.out.println(s.equals(a)); //f
        System.out.println(s.equals(aa)); //t*/
    }
}