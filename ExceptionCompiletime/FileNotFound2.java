package ExceptionCompiletime;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileNotFound2 {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("and.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello");
    }


}
