package ExceptionsRuntime;

public class classCastExce {
    void add() {
        System.out.println("enter a addition:");
    }

}


class Test03 extends classCastExce {
    void sub() {
        System.out.println("enter a substitution:");
    }

    public static void main(String[] args) {
        Test03 obj = (Test03) new classCastExce(); //class cast exception
        obj.sub();
        obj.add();

/*
        try {
            Test03 obj = (Test03) new classCastExce(); //class cast exception
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("we can't take ref of child class and creating object of parent class");
        }*/
    }
}
