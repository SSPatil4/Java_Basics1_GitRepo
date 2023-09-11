package AdvancedLevelQue;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// count number of lines
public class Que02 {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("ReadMeFile.txt");
            obj.write("hello world");
            obj.write(" " + " hello java");
            obj.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
