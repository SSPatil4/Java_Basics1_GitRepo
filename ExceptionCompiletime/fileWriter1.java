package ExceptionCompiletime;
// file writer


import java.io.FileWriter;

public class fileWriter1 {

    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("show.txt");

            try {
                obj.write("hello this is text file this is created using file writer");
            } finally {
                obj.close();
            }
        }
        catch(Exception e){
            e.getStackTrace();
        }
        System.out.println("handled well");
    }
}
