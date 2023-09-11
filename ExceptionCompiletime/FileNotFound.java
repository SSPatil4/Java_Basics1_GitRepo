package ExceptionCompiletime;

import java.io.*;
//file not found exception
public class FileNotFound {

    public static void main(String [] args) {
//        FileInputStream obj = new FileInputStream("name.txt");   // this shows us an exception called FileNotFoundException

        try {
            FileInputStream obj = new FileInputStream("name.sdfvgb");   // this shows us an exception called FileNotFoundException
        } catch (FileNotFoundException e) {//  if we don't handle it in try and catch block

            e.printStackTrace();
        }
        System.out.println("exception handled well");
    }
}


//file not found exception
class FileNot{
    public static void main(String[] args) {
       /* PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("hello");*/
    }

}


// interrupted exception example
class treat{

    public static void main(String[] args) {
       /* System.out.println("i want to sleep for some time");
        Thread.sleep(1000);*/
    }
}
