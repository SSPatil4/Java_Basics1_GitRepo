package AA_SelfDemo;
// testing ground

public interface First{
    void blank();
    void space();

}

class Second implements First{

   public  void blank (){
        System.out.println("hello blank");
       System.out.println("hi \"ratan\" sir");//double cote
       System.out.println("hi \'ratan\' sir");  //single cote
       System.out.println("hi \\ratan\\ sir"); //gives a backslash
       System.out.println("hi\tratan\tsir");  // gives tab
       System.out.println("hi\nratan\nsir");    }

    public void space(){
        System.out.println("hello space");

    }
    public static void main(String [] args){
        Second obj = new Second ();
        obj.space();
        obj.blank();
    }

}
