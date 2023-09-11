package Collection_PAckage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private  String name;
    private int id ;
    private double mob_no;

    public Employee(String name, int id, long mob_no) {
        this.name = name;
        this.id = id;
        this.mob_no = mob_no;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", id=" + id + ", mob_no=" + mob_no + '}';
    }

    public static void main(String[] args) {
        List<Employee> obj = new ArrayList<Employee>();
        obj.add(new Employee("saurabh",1001,55454544));
        obj.add(new Employee("shubham",1002,984544));
        obj.add(new Employee("angad",1003,994544));
        obj.add(new Employee("vijay",1004,78454544));
        obj.add(new Employee("prashant",1005,99454544));
        obj.add(new Employee("vaibhav",1006,7154544));
        obj.add(new Employee("sugreev",1007,454544));
        obj.add(new Employee("hanuman",1008,99454544));
        obj.add(new Employee("Ram",1009,91454544));
        obj.add(new Employee("Laxman",1010,95454544));
        obj.add(new Employee("sita",1011,94454544));
        obj.add(new Employee("ganesh",1012,955454544));
        obj.add(new Employee("mahadev",1013,96454544));
        obj.add(new Employee("vishnu",1014,92454544));
        obj.add(new Employee("indra",1015,95984544));
        obj.add(new Employee("surya",1016,985545454));
        Collections.sort(obj);
        System.out.println(obj);



    }


    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
