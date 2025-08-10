package Basics;
import java.util.Deque;
import java.util.LinkedList;
public class Practice {
	public static void main(String[] args) {
		Deque <String> q=new LinkedList();
		q.add("surenra s");
		q.add("surenra s");
		q.add("surenra s");
		q.add("");
		System.out.println(q.poll());
	}
}