package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashOne {
    public static void main(String[] args) {
// 1. Write a Java program that demonstrates basic hashing operations using HashMap.
// Create a hash map to store student names as keys and their corresponding grades as values.
// Add at least five entries, including a scenario where two students have the same name but different grades.
// Print the hash map to observe how collisions are handled.

        HashMap<String,Character> map = new HashMap<>();

        map.put("Prathosh",'A');
        map.put("Suresh",'O');
        map.put("Muthu",'B');
        map.put("Suresh",'A');
        map.put("Surya",'B');

        System.out.println("Suresh Grade : "+ map.get("Suresh") );


        for (Map.Entry<String,Character> m : map.entrySet()){
            System.out.println("Key "+m.getKey()+ " Value "+m.getValue());
        }


    }
}
