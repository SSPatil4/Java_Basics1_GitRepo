package StaticCretion;

public class program {
    int a = 1;
    static int b = 1;
    program(){
       a++;
        b++;
    }
    public static void main(String[] args) {
        program obj1 = new program();
        System.out.println("print instance variable a "+obj1.a++);
        System.out.println("print static variable b "+b++);
        program obj2 = new program();
        System.out.println("print instance variable a "+obj2.a++);
        System.out.println("print static variable b "+b++);
        program obj3 = new program();
        System.out.println("print instance variable a "+obj3.a++);
        System.out.println("print static variable b "+b++);
    }
}
