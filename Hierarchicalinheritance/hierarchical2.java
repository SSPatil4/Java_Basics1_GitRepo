package Hierarchicalinheritance;

class tiger {
    void q(int a){
        System.out.println("this is tiger class"+" "+a);
    }
}

class deer extends tiger {
    void w (int b ){
        System.out.println("hello");

    }
}
class rabit extends tiger{
    void e(int c){
        System.out.println("hollaa"+" "+c);

    }

}


public class hierarchical2 {

    public static void main (String [] args){
        rabit run = new rabit();
        run.e(1);
        run.q(2);
        deer running = new deer ();
        running.w(3);
        running.q(22);


    }
}
