package Collection_PAckage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {
    public static void main (String [] args ){
        List list = new ArrayList();
        list.add("shiv");
        list.add("mahadev");
        list.add("shambhu");
        list.add("rudra");
        list.add("tandav");
        list.add("mrutunjay");
        list.add("parvatipataye");
        list.add("mahakal");
        list.add("trimbakeshwar");
        list.add("nagnath");
        list.add("maharudra");

        System.out.println("List before reversing ");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("List after reversing ");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
