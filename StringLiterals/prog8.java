package StringLiterals;
// heap memory and string constant pool

public class prog8 {
    public static void main(String[] args) {
        String d = "open";
        String dd = "open";
        String aa = new String("open");
        String a = new String("open");
        System.out.println(d==dd);//t
        System.out.println(d==aa);//f
        System.out.println(d==a);//f
        System.out.println(d.equals(a));//t
        System.out.println(d.equals(aa));//t
        System.out.println(d.equals(dd));//t

    }
}
