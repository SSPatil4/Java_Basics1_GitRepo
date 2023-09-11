package AA_SelfDemo;

import java.io.FileWriter;
import java.io.IOException;

//19. Will the below code compile successfully? If yes, what will be the output of the following program? from static interview QA
public class demo9 {

    FileWriter fi;

    {
        try {
            fi = new FileWriter("Java.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

class Test
{
    Test(Test t) {
        m1();
        System.out.println("Constructor");
    }
    void m1() {
        m2();
        System.out.println("Instance method");
    }
    static void m2() {
        System.out.println("Static method");
    }
   /* public static void main(String[] args)
    {
        new Test(null);
    }*/
}


//20. Is there any error in the below code snippet? If yes, identify the error and give the reason behind it.
/*class Testy
{
    void m1(Test test) {
        System.out.println("Instance method");
    }
    static void m1(Test t) {
        System.out.println("Static method");
    }
}*/

//27. What is the output of the following program code?


class Myclasstest {
    static int a = 20;
    static void m2() {
        a++;
    }
   /* public static void main(String[] args) {
        System.out.println(a);
    }*/
}
