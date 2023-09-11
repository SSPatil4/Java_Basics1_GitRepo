package Collection_PAckage;


import java.util.*;

public class Map_Pro {
    public static void main(String[] args) {
        Map<String ,String > ref = new HashMap<>();
        ref.put("0","saurabh");
        ref.put("1","shubham");
        ref.put("3","akash");
        ref.put("2","vijay");
        ref.put("4","angad");
        ref.put("5","ram");
        ref.put("6","laxman");
        ref.put("7","hanuman");
        ref.put("8","kesari");
        ref.put("9","bajarang");

        System.out.println(ref.keySet());
        System.out.println(ref.values());

        List list1 = new ArrayList(ref.keySet());
      //  list1.add(ref.keySet());
      //  System.out.println(list1);

//        List gh = new ArrayList(ref.get("5"));


        List list2 = new ArrayList(ref.values());
     //   list2.add(ref.values());
      //  System.out.println(list2);

        Collections.sort(list1);
        System.out.println("keys sorting "+list1);

        Collections.sort(list2);
        System.out.println("values sorting"+list2);






    }

}
