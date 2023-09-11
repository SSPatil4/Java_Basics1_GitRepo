package ArayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortingMethod {

    public static void main(String[] args) {
        Object [] array = new Object[4];
//        array [0]=Integer.parseInt("10");
        array[0]=10;
        array[1]=13;
        array[2]=12;
        array[3]=11;
        array[3]=14;

        Arrays.sort(array);
        for (Object s:array) {
            System.out.println(s);
        }
       /* List list = new ArrayList();

        list.add(Integer.parseInt("11"));
        list.add(12);
        list.add(Integer.parseInt("10"));
        list.add(13);

        Collections.sort(list);
        System.out.println(list);*/



    }
}
