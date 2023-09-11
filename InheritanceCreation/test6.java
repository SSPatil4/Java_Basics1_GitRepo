package InheritanceCreation;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

class company{
    void emp(String a){
        System.out.println("employe name"+" "+a);

    }
}
class salary extends company{
    void sal(int b){
        System.out.println("salary of employe"+" "+b);
    }

}
class bank extends salary{
    void ban(String c){
        System.out.println("name of bank"+" "+c
        );
    }
}
public class test6 {
    public static void main(String[] args){
        bank cc = new bank();
        cc.emp("Rama");
        cc.ban("Indian Overseas");
        cc.sal(80000);
    }
}
