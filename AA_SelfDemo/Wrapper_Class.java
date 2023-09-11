package AA_SelfDemo;


public class Wrapper_Class {
public static void main(String [] args) {
//Autoboxing
    int a=10;
    Integer i1= new Integer(10);  // autoboxing explicitly
    Integer j=a;    // autoboxing implicitly
    System.out.println(a+" "+i1+" "+j);

//Unboxing
    Integer a1 = new Integer(20);  //wrapper class if int
    int i=a1.intValue();  //  unboxing explicitly
    int j1 =a1;
    System.out.println(a1+" "+i+" "+j1);



    Character c = new Character('S');
    Boolean b = new Boolean(true);

}



}

