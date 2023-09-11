package MultilevelInheritance;

class sun{
    long l(int a,int b){
        System.out.println("I am a star"+" "+a+" "+b);
        return 45;

    }

}
class venus extends sun {
    long k(int c,int d){
        System.out.println("I am a palnet"+" "+c+" "+d);
        return 4;
    }

}
class earth extends venus {
    long j(int e,int f){
        System.out.println("i am a planet"+" "+e+" "+f);
        return 9;

    }

}
class saturn extends earth{

}
public class InheritanceTest5 {
    public static void main(String[]args){
        saturn check=new saturn();
        check.l(1,2);
        check.k(3,4);
        check.j(5,6);
    }
}
