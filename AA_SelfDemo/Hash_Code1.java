package AA_SelfDemo;

public class Hash_Code1 {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

        // hashCode() Method Returns The Unique Value to the object created using equals method


        Hash_Code1 obj = new Hash_Code1();
        System.out.println(obj.hashCode());

        Hash_Code1 obj1= new Hash_Code1();
        System.out.println(obj1.hashCode());

        String name = "Saurabh";
        String name1 = new String ("Saurabh");

        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
    }


}
