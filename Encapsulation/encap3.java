package Encapsulation;

public class encap3 {

  //  encap3(){}

    public encap3(String name, String add, String email, int age, int mob_no) {
        this.name = name;
        this.add = add;
        this.email = email;
        this.age = age;
        this.mob_no = mob_no;
    }


    @Override
    public String toString() {
        return "encap3{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", mob_no=" + mob_no +
                '}';
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    private String email;
    private int age;
    private int mob_no;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMob_no() {
        return mob_no;
    }

    public void setMob_no(int mob_no) {
        this.mob_no = mob_no;
    }

public static void main(String[]args){
        encap3 cc = new encap3("saurabh","latur","saurabhpatil@gmail.com",26,9822230);
    System.out.println("values of first object cc"+cc.toString());
       /* cc.setName("saurabh");
        cc.setAdd("latur");
        cc.setEmail("saurabhpatil@gmail.com");
        cc.setAge(26);
        cc.setMob_no(982223073);*/

    /* System.out.println("my name is "+cc.getName());
    System.out.println("my add is "+cc.getAdd());
    System.out.println("my email is "+cc.getEmail());
    System.out.println("my age is "+cc.getAge());
    System.out.println("my mob_no is "+cc.getMob_no()); */


    encap3 ck = new encap3("rama","pune","ram@gmail.com",26,9112245);
    System.out.println("values of second object ck"+ck.toString());
}
}
