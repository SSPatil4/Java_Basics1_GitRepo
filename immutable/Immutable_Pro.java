package immutable;

public class Immutable_Pro {

   public static void main(String [] args){

       Navy obj = new Navy("sp" );
       obj.getName();
   }


}

final class Navy{


    private String name;
   public  Navy(String name){
        this.name=name;
        System.out.println(name +" is my name ");
    }

    public String getName(){
       return name;
    }


}
