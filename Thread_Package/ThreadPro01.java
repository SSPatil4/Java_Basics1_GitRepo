package Thread_Package;

public class ThreadPro01 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("count is "+" "+" thread name is "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ThreadPro01 t1= new ThreadPro01();
        t1.setName("RED");
        t1.start();
        ThreadPro01 t2= new ThreadPro01();
        t2.setName("ORANGE");
        t2.start();

    }
}
