package Thread_Package;

public class Thread_Constructors extends Thread{

    public Thread_Constructors(String name){
        super(name);

    }

    public void run(){
        System.out.println("this is from run ");
    }
}


class Testinghh{

    public static void main(String[] args) {
        Thread_Constructors obj = new Thread_Constructors("play");
        obj.start();

    }
}
