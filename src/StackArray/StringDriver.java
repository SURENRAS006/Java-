package StackArray;

public class StringDriver {
	public static void main(String[] args) {
		StackUsingArray st=new StackUsingArray();
		System.out.println(st.capacity);
		st.push("Aravind");
		st.push("Adithiya");
		st.push("Surenra");
		st.push("Dharshan");
		st.push("Aswin");
		st.push("Abdhul");
		System.out.println((st.peek()==null)?"Underflow":st.peek());
		String res=st.pop();
		System.out.println((res==null)?"Underfow ":res);
		res=st.pop();
		System.out.println((res==null)?"Underflow":res);
	}
}
