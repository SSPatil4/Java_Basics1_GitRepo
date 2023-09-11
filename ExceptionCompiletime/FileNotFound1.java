package ExceptionCompiletime;

import java.io.FileReader;
import java.util.Scanner;

public class FileNotFound1 {
    public static void main(String[] args) {

        try {
            FileReader obj = new FileReader("saurabh.txt");
            Scanner sc = new Scanner(obj);
            while(sc.hasNext()){
                String line =sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(" try catch block executed");

    }



}
