package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTwo {
    public static void main(String[] args) {
//        . **Iterate Through a Map**:
//        Create a Java program that initializes a `TreeMap` with the following entries:
//        ("banana", 2), ("apple", 5), ("cherry", 7), ("date", 3).
//        Use an iterator to print each key-value pair in the map.

        TreeMap<String,Integer> treeMap = new TreeMap<>();

        treeMap.put("banana",2);
        treeMap.put("apple",5);
        treeMap.put("cherry",7);
        treeMap.put("date",3);

        Set<Map.Entry<String, Integer>> set = treeMap.entrySet();

        Iterator <Map.Entry<String,Integer>> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
