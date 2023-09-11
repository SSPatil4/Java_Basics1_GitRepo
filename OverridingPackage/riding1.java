package OverridingPackage;

class one {
    String name;
    void add() {
        System.out.println("this is parent class ");
    }

    static void laugh() {
        System.out.println("this is parent class ");
    }
    void normal(){
        System.out.println("normal parent ");
    }
}

class two extends one {
    @Override
    void add() {
        System.out.println("this is child class ");
    }


    static void laugh() {
        System.out.println("this is child class ");
    }
    void normal (char j){
        System.out.println("Normal child ");
    }
}

public class riding1 {
    public static void main(String[] args) {
        one cc = new two();   //UpCasting
//        cc.name="Saurabh Shankarrao Patil";
        System.out.println(cc.name="Patil");
        cc.add();
        cc.normal();


    }
}
