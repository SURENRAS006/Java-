package Singlylinkedlist;
public class SinglyLL {
	Node head=null;
		
//insert in beginning
	void inBegin(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head =newNode;
	}
	
//insert at end
	void atEnd(int data) {
		Node newNode =new Node (data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node current =head;
		while (current.next!=null) {
			current =current.next;
		}
		current.next=newNode;	
	}
		
//delete by value
	void delete (int val) {
		if (head ==null) {
			System.out.println("Linked is empty can't delete");
			return;
		}
	
	if(head.data==val) {
		head=head.next;
		return;
	}
	Node current=head;
	while(current.next!=null && current.next.data!=val) {
		current=current.next;
	}
	if(current.next!=null && current.next.data!=val) {
		current.next=current.next.next;
		return;
	}
	System.out.println(val+"   is not in the List ");
	}
		
//sorting linked list bubble sort
	void bubblesort() {
		if(head==null) {
			return;
		}
		Node current =head;
		boolean flag=true;
		while(flag) {
			flag=false;
			while (current.next!=null) {
				if(current.data>current.next.data) {
					int temp=current.data;
					current.data=current.next.data;
					current.next.data=temp;
					flag=true;
				}
				current=current.next;
			}
			current=head;
		}
	}
	
//search an element
	void search(int val) {
        if(head==null) {
        	System.out.println("ll is empty");
        	return;
        }
        Node current=head;
        int pos=0;
        while(current !=null) {
        	if(current.data==val) {
        		System.out.println(val+" in the list ");
        		return;
        	}
        	pos++;
        	current=current.next;
        }
        System.out.println(val+" not in the list");
	}
        
//print element
	void display() {
		if(head==null) {
			System.out.println("Empty linked list: ");
			return;
		}
		Node current=head;
		while (current.next!=null) {
			System.out.print(current.data+" --> ");
		current=current.next;
		}
		System.out.println(current.data);
	}

}