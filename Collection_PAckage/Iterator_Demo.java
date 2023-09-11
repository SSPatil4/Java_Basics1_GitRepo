package Collection_PAckage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_Demo {
    public static void main(String[] args) {
        List obj =new ArrayList();
        obj.add(101);
        obj.add(102);
        obj.add(103);
        obj.add(104);
        obj.add("saurabh");
        obj.add("patil");

//        System.out.println(obj);
//        Iterator ref = obj.iterator();
//        while (ref.hasNext()){
//            System.out.println("vhngnjg = "+ref.next());
//        }


        ListIterator ref1 = obj.listIterator();
        ref1.next();
        ref1.next();
        ref1.next();
       /* while(ref1.hasPrevious()){
            System.out.println(ref1.previous());
        }
        ref1.set(369);
        System.out.println(obj);*/

        ListIterator rere = obj.listIterator();
        while(rere.hasNext()){
            if(rere.hasPrevious()){
                System.out.println("print if "+rere.next());
            }else {
                System.out.println("print else");
            }
            rere.add("abcdef");
        }

    }
}
