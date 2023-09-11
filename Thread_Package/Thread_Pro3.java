package Thread_Package;

public class Thread_Pro3 implements Runnable{

    @Override
    public synchronized void run() {
      for (int i=0;i<=5;i++){
          System.out.println("count is "+" "+" thread name is "+Thread.currentThread().getName());
      }
    }

    public static void main(String[] args) {
        Thread_Pro3 obj = new Thread_Pro3();
        Thread t = new Thread(obj);

        t.setName("Smooth");
        t.start();

        Thread_Pro3 obj1 = new Thread_Pro3();
        Thread tt = new Thread(obj1);
        tt.setName("Rough");
        tt.start();

    }


}

class Alternate extends Thread{

    @Override
    public void run() {

        synchronized (this){
            for (int i=0;i<=5;i++) {
                System.out.println("count is " + " " + " thread name is " + Thread.currentThread().getName());

            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }




    public static void main(String[] args) {

        Alternate ref = new Alternate();
        Thread t1 = new Thread(ref);
        t1.setName("java ");
        t1.start();

        Thread t2= new Thread(ref);
        t2.setName("programming ");
        t2.start();
    }
    }
