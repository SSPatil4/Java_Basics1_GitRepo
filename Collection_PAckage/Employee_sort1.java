package Collection_PAckage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee_sort1 implements Comparable<Employee_sort1>
{
    private  String name;
    private int id ;
    private double mob_no;

    public Employee_sort1(String name, int id, double mob_no) {
        this.name = name;
        this.id = id;
        this.mob_no = mob_no;
    }

    @Override
    public String toString() {
        return "Test01{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mob_no=" + mob_no +
                '}';
    }



    public static void main(String[] args) {
        List<Employee_sort1> obj = new ArrayList<Employee_sort1>();
        obj.add(new Employee_sort1("saurabh",1001,55454544));
        obj.add(new Employee_sort1("shubham",1002,984544));
        obj.add(new Employee_sort1("angad",1003,994544));
        obj.add(new Employee_sort1("vijay",1004,78454544));
        obj.add(new Employee_sort1("prashant",1005,99454544));
        obj.add(new Employee_sort1("vaibhav",1006,7154544));
        obj.add(new Employee_sort1("sugreev",1007,454544));
        obj.add(new Employee_sort1("hanuman",1008,99454544));
        obj.add(new Employee_sort1("ram",1009,91454544));
        obj.add(new Employee_sort1("laxman",1010,95454544));
        obj.add(new Employee_sort1("sita",1011,94454544));
        obj.add(new Employee_sort1("ganesh",1012,955454544));
        obj.add(new Employee_sort1("mahadev",1013,96454544));
        obj.add(new Employee_sort1("vishnu",1014,92454544));
        obj.add(new Employee_sort1("indra",1015,95984544));
        obj.add(new Employee_sort1("surya",1016,985545454));
        Collections.sort(obj);
        for (Object s:obj) {
            System.out.println(obj);

        }

    }
    @Override
    public int compareTo(Employee_sort1 o) {
        return this.name.compareTo(o.name);
    }

}
