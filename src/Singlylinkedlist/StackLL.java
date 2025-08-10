package Singlylinkedlist;
public class StackLL {
	Node top=null;
//push	
	void push(int data){
		Node newNode=new Node(data);
		newNode.next=top;
		top=newNode;
	}
//pop	
	int pop() {
		if(top==null) {
			return '\0';
		}
		int temp=top.data;
		top=top.next;
		return temp;
	}
//peek	
	int peek() {
		if(top==null) {
			return Integer.MIN_VALUE;
		}
		return top.data;
	}
//size
	int size() {
		if(top==null) {
			return 0;
		}
		int count=1;
		Node current=top;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
}