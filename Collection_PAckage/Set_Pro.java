package Collection_PAckage;

import java.util.HashSet;
import java.util.Set;

public class Set_Pro {
    public static void main(String[] args) {
        Set  set = new HashSet();
        set.add(1001);
        set.add(1001);
        set.add(1002);
        set.add(1002);
        set.add(null);



        System.out.println(set.size());
    }
}
