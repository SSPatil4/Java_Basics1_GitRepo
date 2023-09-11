package Thread_Package;

public class Thread_Constructors1 implements  Runnable {

    public Thread_Constructors1(Runnable r,String name){
        super();

    }

    public void run(){
        System.out.println("this is from run ");
    }
}


class Testinghi{

    public static void main(String[] args) {
        Thread_Constructors obj = new Thread_Constructors("play");
        obj.start();

    }
}
