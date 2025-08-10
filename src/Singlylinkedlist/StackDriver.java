package Singlylinkedlist;
public class StackDriver {
	public static void main(String[] args) {
		StackLL st=new StackLL();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		int val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)? "Stack Underflow":val);
		val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)? "Stack Underflow":val);
		val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)? "Stack Underflow":val);
		val=st.pop();
		System.out.println((val==Integer.MIN_VALUE)? "Stack Underflow":val);
		val=st.peek();
		System.out.println((val==Integer.MIN_VALUE)? "Stack Underflow":val);	
	}
}
//https://kuick.io/5234CL
//https://kuick.io/702WC8