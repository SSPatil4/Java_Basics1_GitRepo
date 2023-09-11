package AA_SelfDemo;

public class Covarient_method {
    public static void main(String[] args) {
        child obj = new child();
        obj.test();
    }
}
class parent {

    parent test(){
         parent p = new parent();
        return p;
//        return new parent();
    }
}

class child extends parent {
    @Override
    child test(){
        System.out.println("child test method");
        return new child();
    }






}
