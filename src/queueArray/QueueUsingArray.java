package queueArray;

public class QueueUsingArray {
	int capacity=5;
	int front=-1;
	int rear=-1;
	String q[]=new String[capacity];
	 
	void add(String st) {
		if (rear==capacity) {
			System.out.println("Queue Overflow");
			return;
		}
		if(front==-1) {
			front=rear=0;
		}
		q[rear++]=st;
		return;
   }
	String poll() {
		if(front==-1) {
			return null;
		}	
	String ret=q[front];
	if(front==-1) {
		front=rear=-1;	
		return ret;
	}
	front++;
	return ret;
	}
}
