package Collection_PAckage;

import java.util.LinkedList;
import java.util.List;

public class Link_list {
    public static void main(String[] args) {
        List obj = new LinkedList();
        obj.add(1001);
//        obj.add(1,1002);
        System.out.println( obj.indexOf(1001));
        System.out.println(obj.size());
        System.out.println(obj.remove(1));
        System.out.println(obj);

    }
}
