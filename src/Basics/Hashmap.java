package Basics;
import java.util.HashMap;
public class Hashmap {
public static void main(String[] args) {
	HashMap<Integer,String> s=new HashMap<>();
	s.put(116, "surenra");
	s.put(117, "AK");
	s.put(118, "THALA");
	s.put(112, "deepk");
	System.out.println(s);
	System.out.println(s.get(116));
	System.out.println(s.keySet());
	System.out.println(s.values());
	for(int i:s.keySet()) {
		System.out.print(i);
	}
}
}
