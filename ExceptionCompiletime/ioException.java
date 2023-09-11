package ExceptionCompiletime;


import java.io.*;

public class ioException {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("ay.txt");
        } catch (IOException e) {

            e.printStackTrace();
//            throw new RuntimeException(e);
        }
        System.out.println("exception handled well");


       /* try {
            if (f.createNewFile()){
                System.out.println("print if file created");
            }else{

                System.out.println("print if file not created");
            }
        } catch (IOException e) {
            System.out.println("exception caught");
            e.printStackTrace();
            //throw new RuntimeException(e);
        }*/
/*
        try {
            FileReader file = new FileReader("saurabh.txt");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }*/


    }

    }

