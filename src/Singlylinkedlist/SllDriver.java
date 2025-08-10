package Singlylinkedlist;
public class SllDriver {
	public static void main(String[] args) {
		SinglyLL sll=new SinglyLL();
		sll.display();
		sll.inBegin(5);
		sll.display();
		sll.inBegin(6);
		sll.display();
		sll.inBegin(25);
		sll.display();
		sll.atEnd(7);
		sll.display();
		sll.bubblesort();
		sll.display();
		sll.search(5);
		sll.display();
		sll.search(77);
		sll.display();
	}
}