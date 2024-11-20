package Map;

import java.util.HashMap;
import java.util.Map;

public class MapFive {
    public static void main(String[] args) {
//        Create a Java program that initializes two `HashMap` objects:
//        the first map with entries ("a", 1), ("b", 2) and the second map
//        with entries ("b", 3), ("c", 4). Write a method to merge the two maps.
//        If a key is present in both maps,
//        the value from the second map should overwrite the value from the first map.
//        Print the resulting map.

        HashMap<String , Integer >map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);

        HashMap<String,Integer> map2=new HashMap<>();
        map2.put("b",3);
        map.put("c",4);

        HashMap<String,Integer> finalMap = new HashMap<>(map);

        finalMap.putAll(map2);

        for (Map.Entry<String , Integer> m : finalMap.entrySet()){
            System.out.println("key "+m.getKey()+ " Value "+m.getValue());
        }
    }
}
