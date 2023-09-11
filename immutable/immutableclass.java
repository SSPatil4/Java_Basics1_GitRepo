package immutable;

final class army {
    private final int no;

    public army(int no) {
        System.out.println(" " + no);
        this.no = no;

    }

    int getNo() {
        System.out.println("my number is =" + no);
        return no;
    }
}

public class immutableclass {
    public static void main(String[] args) {
        army ob = new army(9898885);
        army ob1 = new army(9898885);
        army ob2 = new army(9898885);
        //int data = ob.getNo();
        System.out.println(ob.hashCode());
//        ob.getNo();
        System.out.println(ob1.hashCode());

        System.out.println(ob2.hashCode());

    }

}
