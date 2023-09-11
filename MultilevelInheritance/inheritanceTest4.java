package MultilevelInheritance;


class principal {
    void a(char a) {
        System.out.println("hello" + " " + a);

    }

}

class coordinator extends principal {

    void b(char b) {
        System.out.println("hello" + " " + b);
    }
}

class teacher extends coordinator {

    void c(char d) {
        System.out.println("hello" + " " + d);
    }
}

class student extends teacher {

}

public class inheritanceTest4 {

    public static void main(String[] args) {
        student check = new student();
        check.a('A');
        check.b('B');
        check.c('D');
    }


}
