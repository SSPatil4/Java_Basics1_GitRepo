package Collection_PAckage;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Linked {
    public static void main(String[] args) {
        Set link = new LinkedHashSet();
        link.add(null);
        link.add(null);
        link.add(1001);
        link.add(1002);
        link.add(1001);
        System.out.println(link.size());


    }
}
