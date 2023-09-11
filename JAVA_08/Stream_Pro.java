package JAVA_08;

import java.util.ArrayList;
import java.util.List;

public class Stream_Pro {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> list01 = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("Alpha");
        list.add("Ram");
        list.add("Ganesh");
        list.add("Hanuman");
        list.add("Angad");
        list.add("Amrit");
        String name = "A";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(name.toUpperCase()))
            {
                list01.add(list.get(i));
            }
        }
        System.out.println(list01);

        /*for(String s :list){
            if(s.startsWith("A")){
            list01.add(s);
            }
        }
        for (String dd: list01){
            System.out.println(dd);
        }
*/


    }
}

