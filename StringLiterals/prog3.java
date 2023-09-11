package StringLiterals;
//// heap memory and string constant pool
public class prog3 {
    public static void main(String[] args) {
        String st = new String("sun");
        String sc = new String("sun");
        String s = new String("moon");
        String ss = "moon";
        String sa ="sun";
        System.out.println(s==st); // false
        System.out.println(st==s);//false
        System.out.println(s==sc); // false
        System.out.println(s==ss); //false
        System.out.println(s==sa); //false
        System.out.println(ss.equals(st));//false
        System.out.println(sa.equals(s));//false
        System.out.println(sa.equals(st)); //true
        System.out.println(ss.equals(s)); //true
    }
}
