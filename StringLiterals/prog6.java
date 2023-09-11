package StringLiterals;
//// heap memory and string constant pool
public class prog6 {
    public static void main(String[] args) {
        String q = new String("hi");
        String w = new String("hello");
        String qq= "hello";
        String ww="hi";
        String e="welcome";
        System.out.println(q==e);//f
        System.out.println(q.equals(ww));//t
        System.out.println(qq.equals(e));//f
        System.out.println(w==ww);//f
        System.out.println(qq.equals(q));//f
    }
}
