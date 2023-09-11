package InheritanceCreation;

class parent {
    int a;
    short b;
    byte c;
    long d;

    void activity(int a, int b) {
        System.out.println("this is parent class");
    }

    int run(String add, String city) {
        System.out.println("I am here to Win");
        return 01;
    }
}

class children extends parent {


    public static void main(String[] args) {

        parent check = new parent();
        check.activity(1, 2);
        check.run("ssp","spp");
    }

}

