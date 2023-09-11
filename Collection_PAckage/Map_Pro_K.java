package Collection_PAckage;

import java.util.*;

public class Map_Pro_K {
    public static void main(String[] args) {
        HashMap<String, String> str = new HashMap<>();
        str.put("mumbai", "kalyani");
        str.put("pune", "radha");
        str.put("nagpur", "shweta");
        str.put("nashik", "kimya");
        str.put("latur", "shrdhha");
        str.put("nanded", "kavya");
        str.put("satara", "bhakti");
        str.put("kolhapur", "krushnraj");
        str.put("ahmadnagar", "prajkta");
        str.put("aurngabad", "kshitija");

        System.out.println("All keys : "+str.keySet());
        System.out.println("All Values: "+ str.values());

        //convert map into arraylist
        Set<String> keyset = str.keySet();
        ArrayList<String> setOfKeys = new ArrayList<String>(keyset);
        System.out.println("setofkeys in arraylist: "+setOfKeys);

        Collection<String> keyvalues = str.values();
        ArrayList<String> setOfvalues = new ArrayList<String>(keyvalues);
        System.out.println("setofvalues in arraylist: "+setOfvalues);

// sorting

        List list =new ArrayList(keyset);
        Collections.sort(list);
        System.out.println("sort keys"+list);

        List values =new ArrayList(keyvalues);
        Collections.sort(values);
        System.out.println("sort values"+values);


    }
}
