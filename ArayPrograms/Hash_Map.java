package ArayPrograms;

import java.util.HashMap;
import java.util.Map;


public class Hash_Map {

    public static void main(String[] args) {
        Map list = new HashMap();
        list.put("A",01);
        list.put("B",03);
        list.put("C",04);
        list.put(02,"D");
        list.put(03,"D");
//        list.put(null,1001);
//        list.put(null,10111);
//        list.put(null,10111);
//        list.hashCode();
        System.out.println( list.hashCode());
        System.out.println(list);

        Map list2= new HashMap();
        list2.put("A",02);
        /*list2.put("B",03);
        list2.put("C",04);
        list2.put(02,"D");
        list2.put(03,"D");*/
        System.out.println(list2.hashCode());
        System.out.println(list2);


    }
}
