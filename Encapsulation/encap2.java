package Encapsulation;

import java.util.Comparator;

public class encap2 {
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

    private String citizen;

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public static void main (String[]args){
        encap2 ccc = new encap2 ();
        ccc.setName("Rama");
        ccc.setAdd("Aayodhya");
        ccc.setCitizen("Indian");

        System.out.println("this is my name "+ccc.getName());
        System.out.println("my add "+ccc.getAdd());
        System.out.println("I am the citizen of "+ccc.getCitizen());

        encap2 ck =new encap2();
        ck.setName("Sita");
        ck.setAdd("Aayodhya");
        ck.setCitizen("Indian");

        System.out.println("this is my name "+ck.getName());
        System.out.println("my add "+ck.getAdd());
        System.out.println("I am citizen of "+ck.getCitizen());

    }
}
