package Encapsulation;

public class encap4 {

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

    public encap4(String email, int age, int mob_no) {
        this.email = email;
        this.age = age;
        this.mob_no = mob_no;
    }

    @Override
    public String toString() {
        return "encap4{" +
                "email='" + email + '\'' +
                ", age=" + age +
                ", mob_no=" + mob_no +
                '}';
    }


    public static void main (String[]args){
        encap4 cc =new encap4("saurabh@gmail.com",25,9878978);
        encap4 ck =new encap4("krishna@gmail.com",26,1234567);
        System.out.println("this is obj one "+cc);
        System.out.println("this is obj one"+ck);
    }
}
