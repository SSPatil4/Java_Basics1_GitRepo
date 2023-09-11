package AA_SelfDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable_Program implements java.io.Serializable{

    public int a;
    public String name;

    public Serializable_Program(int a,String name){
        this.a=a;
        this.name=name;

    }

}

class TestSerealizable{

    public static void main(String[] args) {
    Serializable_Program obj = new Serializable_Program(1,"power");
    String filename= "file.ser";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);

            out.close();
            file.close();
            System.out.println("Object has been serialized ");

        } catch (IOException e) {
            System.out.println("IOException is caught");
        }
    }
}
