package Collection_PAckage;

import java.util.*;

public class Comparator_Program {
    private int sr_no;
    private String firstName;
   private double salary;
   private char vowel;
   private char alphabets;

    public char getAlphabets(){
        return alphabets;
    }
    public void setAlphabets(char alphabets){
        this.alphabets=alphabets;
    }

    public char getVowel() {
        return vowel;
    }

    public void setVowel(char vowel) {
        this.vowel = vowel;
    }

    public int getSr_no() {
        return sr_no;
    }

    public void setSr_no(int sr_no) {
        this.sr_no = sr_no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Comparator_Program(int sr_no, String firstName, double salary,char vowel,char alphabets) {
        this.sr_no = sr_no;
        this.firstName = firstName;
        this.salary = salary;
        this.vowel=vowel;
        this.alphabets=alphabets;
    }
    Comparator_Program(){

    }

    @Override
    public String toString() {
        return "Comparator_Program{" +
                "sr_no=" + sr_no +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                ", vowel=" + vowel +
                ", alphabets=" + alphabets +
                '}';
    }

    public static void main(String[] args) {
        Comparator_Program emp1 = new Comparator_Program(1,"saurabh",5.10,'a','z');
        Comparator_Program emp2 = new Comparator_Program(2,"chintu",900.10,'i','x');
        Comparator_Program emp3 = new Comparator_Program(3,"akash",701.00,'o','y');
        Comparator_Program emp4 = new Comparator_Program(4,"vijay",60000,'e','w');
        Comparator_Program emp5 = new Comparator_Program(5,"ganesh",80.10,'u','v');

        List<Comparator_Program> obj = new ArrayList<>();
        obj.add(emp1);
        obj.add(emp2);
        obj.add(emp3);
        obj.add(emp4);
        obj.add(emp5);

        FirstName comparator = new FirstName();
        Collections.sort(obj,comparator);
        System.out.println("First name comparator sorting "+obj);

        Sr_No comparator1 = new Sr_No();
        Collections.sort(obj,comparator1);
        System.out.println("Sr_No sorting "+obj);

        Salary comparator2 = new Salary();
        Collections.sort(obj,comparator2);
        System.out.println("salary comparator "+obj);

        Vowel comparator3 = new Vowel();
        Collections.sort(obj,comparator3);
        System.out.println("character sorting"+obj);

        Alphabets comparator4 = new Alphabets();
        Collections.sort(obj,comparator4);
       // System.out.println("Alphabets sorting "+obj);
        for(Object s:obj){
            System.out.println("Alphabet sorting "+s);
        }





    }
}

class FirstName implements Comparator<Comparator_Program> {


    @Override
    public int compare(Comparator_Program o1, Comparator_Program o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }

}

class Sr_No implements Comparator<Comparator_Program>{


    @Override
    public int compare(Comparator_Program o1, Comparator_Program o2) {
        return o1.getSr_no()-o2.getSr_no();
    }
}

class Salary implements Comparator<Comparator_Program>{
    

    @Override
    public int compare(Comparator_Program o1, Comparator_Program o2) {
        if (o1.getSalary()> o2.getSalary()){
            return 1;
        }else if (o1.getSalary()<o2.getSalary()){
            return -1;
        }
        return 0;
    }
}
class Vowel implements Comparator<Comparator_Program>{

    @Override
    public int compare(Comparator_Program o1, Comparator_Program o2) {
        return o1.getVowel()-o2.getVowel();
    }
}
class Alphabets implements Comparator<Comparator_Program>{

    @Override
    public int compare(Comparator_Program o1, Comparator_Program o2) {
        return o1.getAlphabets()-o2.getAlphabets();
    }
}

