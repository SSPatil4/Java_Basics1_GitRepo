package Collection_PAckage;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Employee_sort implements Comparable<Employee_sort>{
    private int sr_no;
    private String name;
    private String email;
    private double mob_no;


    public Employee_sort(int sr_no, String name, String email, double mob_no) {
        this.sr_no = sr_no;
        this.name = name;
        this.email = email;
        this.mob_no = mob_no;
    }

    @Override
    public String toString() {
        return "Employee_sort{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mob_no=" + mob_no +
                ", sr_no='" + sr_no + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Employee_sort ref = new Employee_sort(5,"ssp","ssp@gmail.com",78785454);

        List <Employee_sort> ob = new ArrayList<>();

        ob.add(new Employee_sort(4,"Durga","Durga@gmail",9822230735d));
        ob.add(new Employee_sort (2,"Balaji","Balaji@gmail",9922121212d));
        ob.add(new Employee_sort(3,"Chintamani","Chintamani@gmail",94222112124d));
        ob.add(new Employee_sort(1,"Akshay","Akshay@gmail",9145127894d));
        ob.add(ref);


        Collections.sort(ob);
        for (Object s:ob) {
                   System.out.println(s);

        }
    }

    @Override
    public int compareTo(Employee_sort o) {
        return this.name.compareTo(o.email);
    }
}
