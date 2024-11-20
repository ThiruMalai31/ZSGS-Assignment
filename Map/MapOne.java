package Map;

import java.util.HashMap;
import java.util.Map;

public class MapOne {
    public static void main(String[] args) {
//        Write a Java program that creates a `HashMap` to store the names and ages of five people.
//        Add the entries ("Alice", 30), ("Bob", 25), ("Charlie", 35), ("Diana", 28), and ("Edward", 40).
//        Retrieve and print the age of "Charlie". Then, print all the names and ages in the map.

        HashMap<String , Integer >map = new HashMap<>();

        map.put("Alice",30);
        map.put("Bob",25);
        map.put("Charlie",35);
        map.put("Diana",28);
        map.put("Edward",40);

        System.out.println("Age of Charlie is "+map.get("Charlie"));

        System.out.println();
        for(Map.Entry<String,Integer> m: map.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());
        }
    }
}
