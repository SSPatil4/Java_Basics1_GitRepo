package Thread_Package;

public class Methods_Thread_Class extends Thread{

    @Override
    public void run() {
        System.out.println("in the run method ");
    }

    public static void main(String []args){
        Methods_Thread_Class obj = new Methods_Thread_Class();
//        obj.start();
        obj.run();

    }
}

class Runnable_Check implements Runnable {

    @Override
    public void run() {
        System.out.println("thread name is "+Thread.currentThread().getName());
        System.out.println("this is run meth");
    }

    public static void main(String[] args) {
        Runnable_Check obj = new Runnable_Check();
        Thread t = new Thread(obj);
        t.setName("First Thread");
        t.start();
//        System.out.println(t.getId());
//        System.out.println(t.getState());
//        System.out.println(t.isAlive());   // giving always false but why ???

//        try {
//            t.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(t.isAlive());   // giving always false but why ???



//        t.start();
//        t.start();   //throws the -> IllegalThreadStateException
//      `  t.stop();

    }
}
