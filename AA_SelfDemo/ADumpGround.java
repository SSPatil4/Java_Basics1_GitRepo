package AA_SelfDemo;

public class ADumpGround {
}
class Kingdom{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String N){
        this.name=N;
    }
   public  static int hi=10;

}

class Ssp extends Kingdom{
    public static void main(String []args){
        Kingdom obj = new Kingdom();
        obj.setName("Saurabh S Patil");
        obj.setName("Shankarrao");
        System.out.println("Print the name "+obj.getName());

//        System.out.println(obj.name("Patil"));
        System.out.println(obj.hi++);
        System.out.println(hi);
        Kingdom ob = new Kingdom();
        System.out.println(hi);
    }

}