package ExceptionCompiletime;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class fileReader {
//FileReader,FileInputStream, FileOutputStream gives file not found exception
    public static void main(String[] args) {
   //    FileReader obj = new FileReader("ssp.txt");
 //       FileOutputStream obj = new FileOutputStream("ssp.txt");
        try {
            FileReader obj = new FileReader("ssp.txt");
//            FileOutputStream obj = new FileOutputStream("ssp.txt");
            Scanner sc = new Scanner(obj);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        System.out.println("Exception handled");


    }

}
