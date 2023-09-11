package StringLiterals;
// heap memory and string constant pool
public class prog7 {
    public static void main(String[] args) {
        String s = "java";
        String ss = new String("java");
        String aa = new String("java");
        String dd = "java";
        System.out.println(s==ss);//f
        System.out.println(aa==dd);//f
        System.out.println(dd==s);//t
        System.out.println(ss.equals(aa));//t
        System.out.println(aa.equals(dd));//t
        System.out.println(s.equals(ss));//t

    }
}
