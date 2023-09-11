package Collection_PAckage;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {
    public static void main(String[] args) {
        Set tree = new TreeSet();
        tree.add(101);
        tree.add(102);
        tree.add(101);
        tree.add(101);
       // tree.add(null); nullpointer exception


        tree.add(Integer.parseInt("102"));
        System.out.println(tree.size());

    }
}
