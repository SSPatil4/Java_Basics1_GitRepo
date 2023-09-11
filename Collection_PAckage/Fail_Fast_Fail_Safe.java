package Collection_PAckage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Fail_Fast_Fail_Safe {

    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
        list.add("Ganesha");
        list.add("Maruti");
        list.add("Mahadev");
        list.add("Ram");
        list.add("Krishna");
        list.add("Vishnu");
        list.add("vijay");


        /*for (int i=0;i<list.size(); i++){          //used for iteration in java
            System.out.println(list.get(i));
        }*/

       /* for (String s : list) {                      //for each loop used for iteration in java
            list.add("saurabh patil");               //throwing ConcurrentModificationException
            System.out.println(s);
        }*/

        //List iterator in java
        //type 01
       /* ListIterator<String> ref =  list.listIterator();
      while(ref.hasNext()){
          ref.add(" Add Bali");     // doesn't give exception called ConcurrentModificationException so it's Non fail-fast iterator(Fail Safe)
          System.out.println("print using list iterator "+ref.next());
      }*/


        //type 02
        /*ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.hasPrevious()) {
                System.out.println("previous element is " + iterator.next());
            }
            iterator.add("Vayu added");
            System.out.println("print using list iterator " + iterator.next());

        }*/

        /*ListIterator<String> reference = list.listIterator();
        while(reference.hasNext()){
            if (reference.hasPrevious()){
                System.out.println("previous element is "+reference.next());
            }else{
                reference.add("Saurabh ");
                System.out.println("element is "+reference.next());
            }
        }*/


        /*ListIterator<String> iterator2 = list.listIterator();    // throwing an exception called NoSuchElementException
        while (iterator2.hasNext()) {
            if (iterator2.hasPrevious()) {
                System.out.println("previous element " + iterator2.next());
            }
            iterator2.add("Patil");
            System.out.println("Using List Iterator " + iterator2.next());

        }*/


        //Iterator in Java
       /* Iterator <String> ite = list.iterator();
        while (ite.hasNext()){
            System.out.println("print iterator "+ite.next());
        }*/


    }

}
