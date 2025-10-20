import java.util.*;
import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        // country(key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 160);
        System.out.println(map);
        map.put("China", 60);
        System.out.println(map);

        // // Search
        // if (map.containsKey("UK")) {
        // System.out.println("Key is present in the map ");
        // } else {
        // System.out.println("Key is not present");
        // }
        // System.out.println(map.get("China")); // Key exist
        // System.out.println(map.get("Indonesia")); // Key doesn't exist

        // for (Map.Entry<String, Integer> e : map.entrySet()) {

        // System.out.println(e.getKey());
        // System.out.println(e.getValue());

        // }
        // Set<String> keys = map.keySet();
        // for (String key : keys) {
        // System.out.println(key + " " + map.get(key));
        // }

        // Deletion / To remove a key
        map.remove("US");
        System.out.println(map);
    }

}
