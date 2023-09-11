package InterfaceCreation;

public interface newtest {
    void a();
}
interface abcd extends newtest{
    void b();
}
class pqr extends u implements abcd{

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    void v() {

    }
}

abstract class u {
    abstract void v();

}
