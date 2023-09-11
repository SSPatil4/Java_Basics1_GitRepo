package Thread_Package;

public class Thread_Pro extends Thread {

    @Override
    public void run() {
        System.out.println("new thread running ");

    }
    public static void main(String[] args) {
        System.out.println("main thread running");

        Thread_Pro ob = new Thread_Pro();
//        Thread tt =new Thread(ob);
        ob.start();
    }
}

class Army implements Runnable {


    @Override
    public void run() {
        System.out.println("This is run method of Army class");
    }

    public static void main(String[] args) {
        System.out.println("main thread running ");
        Army ref = new Army();
        Thread t = new Thread(ref);
        t.start();
    }


}

