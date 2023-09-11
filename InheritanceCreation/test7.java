package InheritanceCreation;

class sbibank {
    void savings(String a){
        System.out.println("saving acc holder name"+" "+a);
    }

}

class current extends sbibank{
    void current(String b){
        System.out.println("current acc holder name"+" "+b);

    }
}
class loan extends current{
    void loan( String c){
    System.out.println("loan acc holder name"+" "+c);
    }
}
class pfaccount extends sbibank{
    void pf(String d){
        System.out.println("pf acc holder name"+" "+d);
    }
}

class pfacc extends loan {
    void pf(String d) {
        System.out.println("pfacc acc holder name" + " " + d);
    }
}


public class test7 {
    public static void main(String [] args){
        loan cc = new loan();
        cc.savings("Ramkrishna");
        cc.current("vitthala");
        cc.loan("hanumanta");


        pfaccount ck = new pfaccount();
        ck.savings("Ganesha");
        ck.pf("Mahadev");


        pfacc cv =new pfacc();
        cv.savings("abcd");
        cv.current("efgh");
        cv.loan("ijkl");
        cv.pf("mnop");
    }
}
