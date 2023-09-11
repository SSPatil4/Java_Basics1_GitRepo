package ExceptionThrows;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowKeyword {

    public static void main (String []args){
        try {
            FileReader file= new FileReader("name.txt");
        } catch (FileNotFoundException | NullPointerException e) {
            throw new RuntimeException(e);
        }

        int a=1,b=0;
        System.out.println(a/b);

    }

}
