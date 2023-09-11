package MethodCreattion;




public class createmethod {
int z;
    byte a(int a,long b){

        System.out.print("first step"+" "+a+" "+b);
        return 1;
    }
    int b(int a,String c){
        int z=10;
        System.out.println("second step "+a+" "+c+z);
        return 2;
    }
    String c(long a,short b, float c){
        System.out.println("third step"+" "+a+" "+b+" "+c);
        return "all";
    }

    public static void main(String[] args){
        createmethod india = new createmethod();
        india.a(65,7657);

        india.b(1,"bsp");
       /* new createmethod().a(12,45454545444l);

        new createmethod().b(1,"ssp");*/



    }
}
