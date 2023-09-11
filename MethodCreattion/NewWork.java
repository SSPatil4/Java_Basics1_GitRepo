package MethodCreattion;

public class NewWork {
  String firstname;
  String middlename;
  String lastname;
  String address;
  int age;


  long talk(String firstname,String middlename,String lastname,String address,int age){
      System.out.println("i am running now,my name is "+firstname+" "+middlename+" "+lastname+" "+address+" "+age);
      return 22;
  }

  int eat (int age,int mobno,char a,String city){
      System.out.println("eating"+" "+age+" "+mobno+" "+'a'+" "+"city");
      return 123;
  }

  boolean sing(int rollno,String name,float decimal){
      System.out.println(+rollno+" "+name+" "+decimal);
      return true;
  }

  public static void main(String[] args){

      NewWork saurabh= new NewWork ();
      saurabh.talk("s","s","patil","latur",25);
      saurabh.eat(25, 982223073, 'g', "pune");
      saurabh.sing(01,"chhatrapati",1.25f);

      NewWork shivaji = new NewWork ();
      shivaji.sing(122,"raje",1.1f);
      shivaji.talk("shiv","shahaji","bhosale","pune",50);
  }
}
