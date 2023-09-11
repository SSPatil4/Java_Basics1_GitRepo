package interviewpack;
class Birds{

   static void add(){
        System.out.println("print add");
    }
    static void sub (){
        System.out.println("javaaa");

    }

}
public class Show extends Birds{
   static void add (){
        System.out.println("add method of Show class");
    }

    static void sub (){
        System.out.println("javaaa of overridden sub");

    }



    public static void main(String[] args) {
        System.out.println("hello main");
        Birds obj= new Show();
       obj.add();
       // Birds.add();
        sub();
      //  Birds.sub();
    }

}



