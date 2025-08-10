package binaryTree;
public class BinaryTreeDrive {
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		b.insert(10);
		b.insert(20);
		b.insert(30);
		b.insert(40);
		b.insert(50);
		b.insert(60);
		b.insert(70);
		b.insert(80);            
		b.inOrder();
		b.preOrder();
		b.postOrder();
	}
}

