package OverloadingPackage;

public class over2 {
    void a(char a){
        System.out.println("a class with three para");
    }
    void a(char a,int b){
        System.out.println("a class with three para");
    }
    void a(char a,int b,char c){
        System.out.println("a class with three para");
    }
    void a(char a,int b,int c,int d){
        System.out.println("a class with three para");
    }
    void a(){
        System.out.println("a class with zero para");
    }
    long s(int a){
        System.out.println("s class with one para");
        return 4545;
    }
    long s(int a,int b,int c){
        System.out.println("s class with three para");
        return 4545;
    }
    int s(int a,char b,int c){
        System.out.println("s class with 3 para");
        return 45;
    }
    long s(){
        System.out.println("s class with three para");
        return 456;
    }

    public static void main(String[]args){
        over2 cc = new over2();
        cc.a('q');
        cc.a('w','e');
        cc.a('r','t','y');
        cc.s(1,2,3);
        cc.s(4,5,6);
        cc.s(7,'u',8);
        cc.s();
    }

}
