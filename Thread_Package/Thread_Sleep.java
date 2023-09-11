package Thread_Package;

public class Thread_Sleep {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
