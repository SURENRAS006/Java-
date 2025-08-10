package Basics;
import java.util.*;

public class CountLettersUingHashMap {
   public static void main(String[] args) {
        HashMap<Character, Integer> s = new HashMap<>();
        String st = "surenra";
 
        for (char ch : st.toCharArray()) {
            s.put(ch, s.getOrDefault(ch, 0) + 1);
        }
       System.out.println(s);
        }
}