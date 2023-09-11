package Collection_PAckage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method_Practice {
    public static void main(String[] args) {
       List grocery = new ArrayList();
       List home_grocery = new ArrayList();
       home_grocery.add(200);
       home_grocery.add(201);
       grocery.add(100);// this adds the value in the array
        grocery.add(100);
       grocery.add(1,101); // this adds the value at the specified index
       /* System.out.println(grocery.toString());  // gets all the length of array / array list
        System.out.println(grocery.get(1));      // gets the index value of array
        System.out.println(grocery.equals(home_grocery));*/
      //  grocery.clear();
       // System.out.println(grocery);
        grocery.add(102);
        grocery.add(3,103);
       // System.out.println(grocery.contains(101));
        /*System.out.println("print all elements of array list "+grocery.toString());
        System.out.println(grocery.addAll(home_grocery));
        System.out.println(grocery);*/
        /*System.out.println(grocery.addAll(1,home_grocery));
        System.out.println(grocery);*/
//        System.out.println(grocery.addAll(home_grocery));
//        System.out.println(grocery.addAll(2,home_grocery));
//        System.out.println(grocery);
        System.out.println("comtains all "+grocery.containsAll(home_grocery));

        System.out.println("compare empty "+grocery.isEmpty());
        System.out.println(grocery.addAll(home_grocery));
        System.out.println(grocery);
        System.out.println(grocery.lastIndexOf(102));
        System.out.println(grocery.remove(1));
        System.out.println(grocery.size());
        System.out.println(grocery.equals(101));
       // System.out.println(grocery.removeAll(home_grocery));
       // System.out.println(grocery);
       // System.out.println(grocery.retainAll(home_grocery));

        System.out.println(home_grocery);
        System.out.println(grocery);
//        System.out.println(grocery.hashCode());
        System.out.println(grocery.set(1,5000));




    }
}
