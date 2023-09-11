package AdvancedLevelQue;

import java.io.File;

public class Que01 {
    public static void main(String[] args) {
        File obj = new File("C:/Users/DELL/OneDrive/Attachments/Desktop/Homework");
        String [] array = obj.list();
        for (Object o:array){
            System.out.println(o);
        }
    }
}
