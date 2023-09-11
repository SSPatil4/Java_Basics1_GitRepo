package StaticCretion;

public class program2 {

    static int var1 = 10;  //static
    int var2 = 10;         //instance
  static  void add(){
      int a=1;
        int b=8;
  }

    public static void main(String[] args) {
        program2 object1 = new program2();
        object1.var1 = 20;
        object1.var2 = 20;
        System.out.println("object1.var1 ttt "+object1.var1);
        System.out.println("object1.var2 tttt "+object1.var2);


        program2 object2 = new program2();
        object2.var1 = 30;
        object2.var2 = 30;

        program2 object3 = new program2();
        object3.var1 = 40;
        object3.var2 = 40;


        System.out.println("object1.var1 "+object1.var1);
        System.out.println("object1.var2 "+object1.var2);

        System.out.println("object2.var1 "+object2.var1);
        System.out.println("object2.var2 "+object2.var2);

        System.out.println("object3.var1 "+object3.var1);
        System.out.println("object3.var2 "+object3.var2);


        object1.var1 = 50;
        object1.var2 = 10;
        System.out.println(object2.var1); // Prints:
        System.out.println(object3.var1); // Prints:
        System.out.println(object2.var2); // Prints:
        System.out.println(object3.var2); // Prints:

    }
}
