package ExceptionCompiletime;

import java.io.FileInputStream;
import java.io.FileWriter;

public class fileWriter {
// FileWriter gives IOException
    public static void main(String[] args) {
//        FileWriter ob = new FileWriter("akash.txt");
        try {
            FileWriter ob = new FileWriter("akash.txt");
//            try {
//                ob.write("this is Akash file ");
//            }finally {
//
//                ob.write("hello I am akash  I am handsome");
//                ob.close();
//            }

        }catch (Exception ee){
            System.out.println("check");
            ee.printStackTrace();
        }
        System.out.println("the remaining code is executed");
    }
}
