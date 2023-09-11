package ExceptionThrows;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws_exception {

    void parent()throws Exception {
        System.out.println("parent throws Exception");
    }
}

class thro extends Throws_exception{
    @Override
    void parent()throws IOException{
        System.out.println("child throws IOException");

    }

    public static void main(String[] args) throws Exception {
        Throws_exception obj = new thro ();
        obj.parent();
    }
}
