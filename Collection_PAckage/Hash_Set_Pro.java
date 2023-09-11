package Collection_PAckage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hash_Set_Pro {

    public static void main(String[] args) {
        Set s = new LinkedHashSet();
        s.add("saurabh");
        s.add(null);
        s.add("shubham");
        s.add("akash");
        s.add("saurabh");
        s.add("vijay");
        s.add(null) ;

        System.out.println(s);

        Set ss = new HashSet();
        ss.add("saurabh");
        ss.add("akash");
        ss.add("shubham");
        ss.add(null);
        ss.add(null);
        ss.add("saurabh");
        ss.add("vijay");

        System.out.println(ss);

    }
}
