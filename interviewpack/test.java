package interviewpack;

public class test {
}

class first{


    public static void m1(){
        System.out.println("Hello m1");
        m2();
    }
    public static void m2(){
        System.out.println("Hello m2");
    }

    public static void main(String[]args){
        m1();

        System.out.println("Hello main");
    }

}

class second{}
