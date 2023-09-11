package OverloadingPackage;

public class over4 {
    void a(char a){
        System.out.println("this is a class with one para "+'A');
    }
    void a(int a,char b){
        System.out.println("this is a class with two para "+04 +'B');
    }
    void a(long l){
        System.out.println("this is a class with three para "+9822230735l);
    }
    void a(String s){
        System.out.println("this is a class with one para "+"Saurabh");
    }
    int b(long l){
        System.out.println("class with one para "+9822307354l);
        return 1;
    }
    int b(long a,String b){
        System.out.println("class with two para "+9423348369l +"shankarrao");
        return 1;
    }
    int b(int a,int b){
        System.out.println("class with two para "+04 +10);
        return 1;
    }


}

class name{
    public static void main (String []args){
        over4 cc = new over4();
        cc.a('V');
        cc.a(45);
        cc.a("sss");
        cc.a(1,'a');
        cc.b(9887);
        cc.b(4,5);
        cc.b(4,"k");


    }
}
