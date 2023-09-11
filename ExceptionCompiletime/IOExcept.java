package ExceptionCompiletime;

import java.io.*;

public class IOExcept {
    public static void main(String[] args) {
       // FileWriter file = new FileWriter("input.txt");
        try {
            FileWriter file = new FileWriter("input.txt");
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);

        }


       // FileInputStream obj = new FileInputStream("saurabh.txt");

       /* try {
            FileInputStream obj = new FileInputStream("saurabh.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
*/

    }


}
