package ArayPrograms;

import java.util.TreeSet;

public class Tree_Set {

    public static void main(String[] args) {
        TreeSet list = new TreeSet();
        list.add("saurabh");
        list.add("surya");
        list.add("ganesh");
        list.add("shubham");
        list.add("kesari");
//        list.add(null);
        list.add("kesari");
//        list.clear();
        list.clone();

//        list.remove("surya");
        System.out.println(list);
    }
}
