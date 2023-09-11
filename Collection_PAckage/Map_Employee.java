package Collection_PAckage;

import java.util.*;

public class Map_Employee implements Comparable<Map_Employee>{
    private String firstName;
    private String middleName;
    private String lastName;
    private int empId;

    public Map_Employee(String firstName, String middleName, String lastName, int empId) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Map_Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empId=" + empId +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public static void main(String[] args) {
        Map<Map_Employee,String> list = new HashMap();
        list.put(new Map_Employee("saurabh","shankar","patil",1002), "manager");
        list.put(new Map_Employee("shubham","ramesh","barude",1003),"Owner");
        list.put(new Map_Employee("vijay","maroti","kadpewad",1001),"Ceo");

        List ref1 = new ArrayList(list.keySet());
        Collections.sort(ref1);
        System.out.println("emp id sorting "+ref1);


        test101 test = new test101();
        List ref2 = new ArrayList(list.keySet());

        Collections.sort(ref2,test);
        System.out.println("name sorting by comparator "+ref2);

    }

    @Override
    public int compareTo(Map_Employee o) {
        return this.getEmpId()-o.getEmpId();
    }
}
class test101 implements Comparator<Map_Employee>{


    @Override
    public int compare(Map_Employee o1, Map_Employee o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}