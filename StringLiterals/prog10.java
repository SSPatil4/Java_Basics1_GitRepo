package StringLiterals;
// heap memory and string constant pool

public class prog10 {
    public static void main(String[] args) {
        String q = new String("hello");
        String w = new String("hello");
        String qq= "style";
        String ww="hi";
        String e="style";
        System.out.println(q==e);//f
        System.out.println(q.equals(ww));//f
        System.out.println(qq.equals(e));//t
        System.out.println(w==ww);//f
        System.out.println(qq.equals(q));//f
    }
}
