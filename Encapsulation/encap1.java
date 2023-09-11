package Encapsulation;

public class encap1 {
    private
    String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private
    String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private
    String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    private
    int emp_id;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    private
    double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        encap1 cc =new encap1();
        cc.setFirstName("Saurabh");
        cc.setLastName("Patil");
        cc.setAdd("Latur");
        cc.setEmp_id(123456);
       // cc.setSalary(9999999.99);
        cc.setSalary(99999.99);

        System.out.println("My first name is  "+ cc.getFirstName());
        System.out.println("My last name is  "+ cc.getLastName());
        System.out.println("My address is "+ cc.getAdd());
        System.out.println("My emp_id is this "+cc.getEmp_id());
        System.out.println("My salary is "+cc.getSalary());


        encap1 ck = new encap1();
        ck.setFirstName("Shankar");
        ck.setLastName("Patil");
        ck.setAdd("Latur");
        ck.setEmp_id(456789);
        ck.setSalary(1000000);

        System.out.println("My first name is  "+ ck.getFirstName());
        System.out.println("My last name is  "+ ck.getLastName());
        System.out.println("My address is "+ ck.getAdd());
        System.out.println("My emp_id is this "+ck.getEmp_id());
        System.out.println("My salary is "+ck.getSalary());

    }

}
