package queueArray;

public class QueueDriver {
	public static void main(String[] args) {
		QueueUsingArray q=new QueueUsingArray();
		String res=q.poll();
		System.out.println((res==null)?"underflow":res);
		q.add("Thala");
		q.add("Ajith Kumar");
		q.add("Rohit");
		q.add("Virat");
		q.add("Sachin");
		q.add("cvb");
		res=q.poll();
		System.out.println((res==null)?"underflow":res);
		res=q.poll();
		System.out.println((res==null)?"underflow":res);
		res=q.poll();
		System.out.println((res==null)?"underflow":res);
		res=q.poll();
		System.out.println((res==null)?"underflow":res);
		res=q.poll();
	}
}
