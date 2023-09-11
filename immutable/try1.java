package immutable;
final class first{
    private final String name ;

    public first(String name){
        this.name=name;
        System.out.println("MY NAME IS "+name);

    }
    String getName(){
        System.out.println("print my name ="+name);
        return name;
    }

}
public class try1 {
    public static void main(String[] args) {
        first obj = new first("SAURABH");
        obj.getName();

    }


}
