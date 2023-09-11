package StringLiterals;
//// heap memory and string constant pool
public class prog4 {
    public static void main(String[] args) {
        String a ="java";
        String s ="oracle";
        String d="sun";
        String f = "java"; //literal string
        String g= "oracle";
        String aa= new String("java");
        String ss = new String("sun");
        String dd = new String("oracle");
        System.out.println(s.equals(ss)); //f
        System.out.println(s.equals(dd)); //t
        System.out.println(s==g); //t
        System.out.println(s==dd);//f
        System.out.println(s.equals(a));//f
        System.out.println(f.equals(dd));//f
    }
}
