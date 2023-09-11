package StringLiterals;
// heap memory and string constant pool

public class prog9 {
    public static void main(String[] args) {
        String st = new String("star");
        String sc = new String("sun");
        String s = new String("moon");
        String ss = "moon";
        String sa ="star";
        System.out.println(s==st); // f
        System.out.println(st==s);//f
        System.out.println(s==sc); // f
        System.out.println(s==ss); //f
        System.out.println(s==sa); //f
        System.out.println(st.equals(sa));//t
    }
}
