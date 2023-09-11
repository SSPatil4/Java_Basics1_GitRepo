package ExceptionThrows;

public class Throws1 {




    
}

class ClassA {

    void play() {
        ClassB bb = new ClassB();
        try {
            bb.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Calling Class A's method");
    }
}

class ClassB {
    void test() throws Exception {
        ClassA a = null;
        a.play();
        // throw new NullPointerException();
       // throw  new Exception();
        //System.out.println("Calling Class B's method");
    }
}

class ClassC {
    void show() {
        ClassB b = new ClassB();
           try {
            b.test();

        } catch (Exception e) {
               throw new RuntimeException(e);
        }

        System.out.println("Calling Class C's method");
    }
}

class ClassD {

    public static void main(String[] args) {
        ClassC c = new ClassC();
        try {
            c.show();
        } catch (Exception ne) {
            System.out.println("Test " + ne.getStackTrace());
        }

    }
}


class ThrowsTest {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        try {
            c.show();
        } catch (Exception ex) {
            System.out.println("Exception caught");
        }
    }
}

