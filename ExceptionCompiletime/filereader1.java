package ExceptionCompiletime;

import java.io.FileReader;
import java.util.Scanner;

public class filereader1 {

    void show(){
        //FileReader obj = new FileReader("ssp.txt");

        try {
            FileReader obj = new FileReader("ssp.txt");
            Scanner sc = new Scanner(obj);

            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("exception is caught ");
            e.printStackTrace();

        }
        System.out.println("exception handled");
    }

    public static void main(String[] args) {
        filereader1 ob =new filereader1();
        ob.show();
    }
}
