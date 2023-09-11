package ExceptionThrows;
import java.io.*;
// can we use throw and throws together in java
public class ThrowsAndThrow {
    void first() throws IOException {
        throw new IOException("error");
    }

    void second() throws IOException {
        first();
    }

    void third() {
        try {
            second();
        } catch (Exception e) {
           // System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println("work is done");
        }
    }

    public static void main(String[] args) {
        ThrowsAndThrow obj = new ThrowsAndThrow();
        obj.third();
        System.out.println("all in control");
    }
}
