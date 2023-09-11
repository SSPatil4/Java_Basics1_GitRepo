package Collection_PAckage;

import java.util.HashMap;
import java.util.Map;

public class Map_intro {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Ganesh", 001);
        map.put("Vinayak", 001);
        map.put("lambodar", 002);
        map.put("ganapati", 003);
        map.put("ekdanta", 004);

        /*System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get("ekdanta"));
        System.out.println(map.getOrDefault("ganapati",003));
        System.out.println(map.containsKey("Vinayak"));
        System.out.println(map.containsValue(005)); //false
        System.out.println(map.entrySet());
        System.out.println(map.equals(map));
        System.out.println(map.hashCode());
        System.out.println(map.isEmpty());
        System.out.println(map.remove("ekdanta")); //4
        System.out.println(map);
        System.out.println(map.get("Ganesh"));
        System.out.println(map.replace("Ganesh",005));
        System.out.println(map);
        map.replace("Ganesh",005,100);*/
        System.out.println(map);
        map.clear();
        System.out.println(map);


       /* try {
            map.wait(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
//            throw new RuntimeException(e);
        }*/


       /* for (int i=1;i>=1;i++){
            System.out.println(i);
            try {
                map.wait(100000);
            } catch (InterruptedException e) {
               // throw new RuntimeException(e);
            }

        }*/




    }
}

