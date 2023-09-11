package Collection_PAckage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//arrayList
public class ImmutableCollection {
    public static void main(String [] args){
        List ob = new ArrayList();

        ob.add("vinayak");
        ob.add("ganadhyaksha");
        ob.add("lambodar");
        ob.add("ekdanta");
        ob.add("gajanan");
        ob.add("varad");
        ob.add("ganapati");

        Collections.synchronizedList(ob);
        System.out.println(ob instanceof ArrayList);


    }



}
