package AA_SelfDemo;

import java.util.*;

public class ListToMapPro {
    public static void main(String [] args){
        Student50 stu = new Student50("Saurabh ", "Patil",25);
       Student50 stu1 = new Student50("Kesari","Nandan",1);
       Student50 stu2 = new Student50("Ganesh","Deva",2);
       Student50 s = new Student50();
//       s.setfName("Vaishnavi");
//       s.setfName("Shankarrao");
//       s.setfName("Bharati");

       
       List<Student50> obj = new ArrayList<Student50>();
       obj.add(stu);
       obj.add(stu1);
       obj.add(stu2);

       obj.add(new Student50("ssp","spp",11));
       obj.add(new Student50("Kanchan","Ankushe",3));
       obj.add(new Student50("Angad","Vaidya",4));
       obj.add(new Student50("Shankar","Patil",5));

       List<Student50> obj1 = new LinkedList<Student50>();
       obj1.add(new Student50("Bhujang","Patil",21));
       obj1.add(new Student50("Yogesh","Patil",13));
       obj1.add(new Student50("Kanha","Patil",14));


        Map<Integer,String> map1 = new HashMap<Integer,String>();
        for(Student50 oo :obj1) {
            map1.put(oo.getAge(),oo.getfName());
        }
        System.out.println(map1);


      Map<Integer , String > map = new HashMap<Integer,String>();

        for (Student50 o:obj) {
            map.put(o.getAge(),o.getfName());

        }
        System.out.println(map);



    }
}

class Student50 extends ListToMapPro {
    private String fName;
    private String lName;
    private int age;

    public Student50() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student50(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student100{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                '}';
    }







}
