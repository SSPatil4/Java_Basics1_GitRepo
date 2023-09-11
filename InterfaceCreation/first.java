package InterfaceCreation;

public interface first {
    abstract void test();

    public static void main(String[] args) {
      // first cc = new first();
    }
}
class second implements first{
    @Override
    public void test(){
        System.out.println("this is test class");
    }

}
