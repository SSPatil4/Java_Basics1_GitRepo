package JAVA_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collector_Class_Methods {

    public static void main(String[] args) {
        List <String>list = new ArrayList<String>();
        list.add("ganapati");
        list.add("ganapati");
        list.add("ganesha");
        list.add("vinayak");
        list.add("lambodar");
        list.add("lambodar");
        list.add("varad");
        list.add("ekdanta");
        list.add("ganesha");
        list.add("gajanan");
        list.add("gajanan");

        Set ref= list.stream().filter(f->f.startsWith("g")).collect(Collectors.toSet());
        System.out.println(ref);

//        Set ref= list.stream().filter(f->f.startsWith("g",0)).collect(Collectors.toSet());
        System.out.println(ref);

//        Set ref= list.stream().map(String ::length).collect(Collectors.toSet());
        System.out.println(ref);




    }
}
