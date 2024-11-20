package Map;

import java.util.HashMap;
import java.util.Map;

public class MapFour {
    public static void main(String[] args) {
//     Write a Java program that uses a `HashMap` to count the frequency of each character
//     in a given string. For example, for the string "programming", the program should output the frequency
//     of each character in the string.

        HashMap<Character,Integer> map = new HashMap<>();

        String word="programming";

        for (int i=0;i<word.length();i++){
            if(!map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i),1);
            }
            else{
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
        }

        for(Map.Entry<Character,Integer>m : map.entrySet()){
            System.out.println("Character "+m.getKey()+ " "+" Frequency "+m.getValue());
        }
    }
}
