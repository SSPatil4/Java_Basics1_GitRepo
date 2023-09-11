package ExceptionsRuntime;

public class StackOverflowError {
    static void Show() {
        See();
    }

    static void See() {
        Show();
    }


    public static void main(String[] args) {
        Show();

    }
}
