package Thread_Package;

public class Thread_Pro1 extends Thread {


    @Override
    public void run() {
        Thread th1 = Thread.currentThread();
        System.out.println(th1);
        System.out.println("New thread starts running ");
        System.out.println("I am in run() method ");
    }

    public static void main(String[] args) {
        System.out.println("Main thread starts running ");
        Thread ct1 = Thread.currentThread();
        System.out.println("16 " + ct1);

        int ac1 = Thread.activeCount();
        System.out.println("19 " + ac1);

        Thread_Pro1 tp = new Thread_Pro1();
        int ac2 = Thread.activeCount();
        System.out.println("23 " + ac2);
        tp.start();

        Thread t = new Thread(tp);
        int ac3 = Thread.activeCount();
        System.out.println("28 " + ac3);
        t.start();

        int ac4 = Thread.activeCount();
        System.out.println("32 " + ac4);
        t.setName("Thread_Pro1");


    }
}
//
//class Thr implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("runnable method");
//    }
//
//    public static void main(String[] args) {
//        Thr obj = new Thr();
//        Thread y = new Thread(obj,"thr");
//        y.start();
//
//    }
//}
