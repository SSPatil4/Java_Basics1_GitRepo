package AA_SelfDemo;


public class Hash_Code {

   /* @Override
    public int hashCode() {
        return 1000;
    }*/

    public static void main(String[] args) {
        Hash_Code dm = new Hash_Code();
        System.out.println(dm.hashCode());

        Hash_Code dm1 = new Hash_Code();
        System.out.println(dm1.hashCode());

        String s = "ABC";
        String s1 = new String("ABC");

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

    }

}








