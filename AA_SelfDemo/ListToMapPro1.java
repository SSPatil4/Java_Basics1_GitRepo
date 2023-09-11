package AA_SelfDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapPro1 {
    public static void main(String [] args) {
        Student100 stu = new Student100("Saurabh ", "Patil", 25);
        Student100 stu1 = new Student100("Kesari", "Nandan", 1);
        Student100 stu2 = new Student100("Ganesh", "Deva", 2);

        List<Student100> obj = new ArrayList<Student100>();
        obj.add(stu);
        obj.add(stu1);
        obj.add(stu2);

        Map<Integer , String > kk = obj.stream().collect(Collectors.toMap(Student100::getAge,Student100::getfName));
        System.out.println(kk);

        Map<Integer , String > kk1 = obj.stream().collect(Collectors.toMap(x->x.getAge(),y->y.getfName()));
        System.out.println(kk1);

        Map<Integer , String > kk2 = obj.stream().collect(Collectors.toMap(x->x.getAge(),x->x.getfName()));
        System.out.println(kk2);


    }
}

class Student100 extends ListToMapPro1 {
    private String fName;
    private String lName;
    private int age;

    public Student100() {
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

    public Student100(String fName, String lName, int age) {
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
