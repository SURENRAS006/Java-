package DoublyLinkedList;
class Node {
    int data;
    Node next;
    Node prev;
}

class Process {
    Node head;
    Node tail;

// Insert at beginning
    void insertBegin(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        newnode.prev = null;
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
    }

// Insert at end
    void insertEnd(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        newnode.prev = null;
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

// Insert at position
    void insertPos(int data, int pos) {
        int count = 1;
        if (pos == 0) {
            insertBegin(data);
            return;
        }
        Node cur = head;
        while (cur != null) {
            if (count == pos) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = cur.next;
                if (cur.next != null) {
                    cur.next.prev = newNode;
                }
                cur.next = newNode;
                newNode.prev = cur;
                return;
            }
            count++;
            cur = cur.next;
        }
        System.out.print("Index out of Bounds");
    }

// Display forward
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"<---->");
            temp = temp.next;
        }
    }

// Display reverse
    void revdisplay() {
        Node temp = tail;
        System.out.println("Reverse:");
        while (temp != null) {
            System.out.print(temp.data+"<---->");
            temp = temp.prev;
        }
    }
    
//deleteBegin
    void deleteBegin () {
    	Node temp=head;
        System.out.println("DeleteBegin:");
    	if(head ==null) {
    		System.out.println("Empty");
    	}
    	else {
    		temp.next.prev =null;
    		head=head.next;
    	}  	
    }
    
//DeletePos
    void deletePos(int pos) {
    	Node temp=head;
    	Node pre=null;
    	if(head==null) {
    		System.out.println("Empty");
    	}
    	else {
    		for(int i=1;i<=pos;i++) {
    			pre =temp;
    			temp=temp.next;
    		}
    		temp.next.prev=pre;
    		pre.next=temp.next;
    		temp.next=null;
    		temp.prev=null;
    	}
    }
    
//search
    void search(int key) {
    	Node temp=head;
    	int pos=0;
    	boolean found=false;
    	while(temp !=null) {
    		if(temp.data==key) {
    			System.out.println("Element"+key+"found at position");
    			found = true;
    			break;
    		}
    		temp=temp.next;
    		pos++;
    	}
    	if (!found) {
    		System.out.println("Element"+key+"not in the list");
    	}
    }

// Main method
    public static void main(String[] args) {
        Process s = new Process();
        s.insertBegin(10);
        s.insertEnd(20);
        s.insertPos(15, 1);
        s.display();
        System.out.println("null");
        s.revdisplay();
        System.out.println("null");
        s.deleteBegin();
        s.display();
        System.out.println("null");
        s.deletePos(15);
        s.display();
        s.search(10);
        s.display();
    }
}