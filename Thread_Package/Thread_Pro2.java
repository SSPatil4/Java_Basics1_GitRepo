package Thread_Package;

public class Thread_Pro2 implements Runnable{

    public static void main(String[] args) {
        Thread_Pro2 r = new Thread_Pro2();
        Thread t = new Thread(r,"Play");
        t.start();
        String str = t.getName();
        System.out.println(str);
    }

    @Override
    public void run() {
        System.out.println("Start playing");
    }
}
