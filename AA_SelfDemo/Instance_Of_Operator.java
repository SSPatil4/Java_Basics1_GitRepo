package AA_SelfDemo;

public class Instance_Of_Operator {
    public static void main(String[] args) {

        Instance_Of_Operator obj = new Instance_Of_Operator();
        System.out.println(obj instanceof Instance_Of_Operator);

        Inst obj1 = new Inst();
        System.out.println(obj1 instanceof Inst);

        String name = "Saurabh";
        System.out.println(name instanceof String);
    }
}

class Inst {

}
