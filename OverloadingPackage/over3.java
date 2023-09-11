package OverloadingPackage;

public class over3 {
    int add(int a){
        System.out.println("addition "+a);
        return a;
    }
    int add(int a,int b){
        System.out.println("addition "+(a+b));
        return a+b;
    }
    int add(int a,int b,int c){
        System.out.println("addition "+(a+b+c));
        return a+b+c;
    }
    int add(int a,int b,int c,int d){
        System.out.println("addition "+(a+b+c+d));
        return a+b+c+d;
    }

    void sub(int a,int b){
        System.out.println("substraction"+(a-b));
    }
    void sub(int a,int b,int c){
        System.out.println("substraction"+(a-b-c));
    }
    void sub(int a,int b,int c,int d){
        System.out.println("substraction"+(a-b-c-d));
    }
    void sub(int a,int b,int c,int d,int e){
        System.out.println("substraction"+(a-b-c-d-e));
    }


    public static void main (String [] args){
        over3 cc = new over3();
        cc.add(1);
        cc.add(10,20);
        cc.add(10,20,30);
        cc.add(10,20,30,40);

        cc.sub(20,30);
        cc.sub(30,20,10);
        cc.sub(50,40,30,20,10);
        cc.sub(60,50,40,30);
    }


}
