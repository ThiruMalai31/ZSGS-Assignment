package Map;

import java.util.HashMap;
import java.util.Map;

public class MapThree {
    public static void main(String[] args) {
//        Write a Java program that creates a `HashMap` to store student names and their corresponding grades.
//        Add the entries ("John", 85), ("Jane", 92), ("Tom", 76), ("Lucy", 89).
//        Check if "Tom" is in the map and remove his entry if it exists. Print the updated map.

        HashMap<String,Integer> map = new HashMap<>();

        map.put("John",85);
        map.put("Jane",92);
        map.put("Tom",76);
        map.put("Lucy",89);

        if(map.containsKey("Tom")){
            map.remove("Tom");
        }

        System.out.println("Modified List");
        for (Map.Entry<String,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+ " " +m.getValue());
        }
    }
}
