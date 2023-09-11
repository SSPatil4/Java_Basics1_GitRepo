package ExceptionCompiletime;



import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test_Exception {
    static {
        try {
            FileReader obj = new FileReader("run.txt");
        } catch (FileNotFoundException e) {
            System.out.println("exception caught");
           // throw new RuntimeException(e);
        }
    }




    public static void main(String[] args) {
        Test_Exception o = new Test_Exception();
        System.out.println(20.0/0);
    }
}



