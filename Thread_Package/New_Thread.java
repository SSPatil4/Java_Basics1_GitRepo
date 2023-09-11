package Thread_Package;

public class New_Thread  implements Runnable{
    @Override
    public synchronized void run(){
        for (int i=0;i<4;i++){
            System.out.println("count is "+i+" thread name is "+Thread.currentThread().getName());
        }
    }
}

class Testuu{
    public static void main (String [] args){
        Thread obj = new Thread(new New_Thread());
        obj.setName("Child01");
        obj.start();
        System.out.println(  obj.getId());
        System.out.println(obj.getState());

        Thread obj1 = new Thread(new New_Thread());
        obj1.setName("Child02");
        obj1.start();
        obj1.setPriority(10);

    }

}
