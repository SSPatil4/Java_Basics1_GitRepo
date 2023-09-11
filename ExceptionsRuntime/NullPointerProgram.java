package ExceptionsRuntime;
// NullPointer Exception


public class NullPointerProgram {

    public static void main(String[] args) {

        String str = null;
        System.out.println(str.length());
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("exception handled well ");
    }
}
