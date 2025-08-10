package binaryTree;
public class BinaryTree {
	TreeNode root=null;
	static final int NODE_COUNT=100;
	public void insert(int data) {
		TreeNode newNode=new TreeNode(data);
		if(root==null) {
		root=newNode;
			return;
		}
		CircularQueue q=new CircularQueue(NODE_COUNT);
		q.enQueue(root);
	while(!q.isEmpty()) {
			TreeNode current=q.deQueque();
			if(current.left==null) {
				current.left=newNode;
				return;
			}
			else {
				q.enQueue(current.left);
			}
			if(current.right==null) {
				current.right=newNode;
				return;
			}
			else {
			q.enQueue(current.right);
			}
		}
	}
	public void delete(int key) {
		if(root==null) {
			System.out.println("Empty Tree");
			return;
		}
		TreeNode keyNode=null,current=null,parent=null;
		CircularQueue q=new CircularQueue(NODE_COUNT);
		while(!q.isEmpty()) {
			current=q.deQueque();
			if(current.data==key) {
				keyNode=current;
			}
			if(current.left!=null) {
				parent=current;
				q.enQueue(current.left);
			}
		if(current.right!=null) {
			parent=current;
				q.enQueue(current.right);
		}
		}
		if(keyNode==null) {
			System.out.println("Value not in the tree");
		return;
		}
		keyNode.data=current.data;
		if(parent.right==current) {
			parent.right=null;
		}
		else {
			parent.left=null;
	}
	}
	public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
            }
    }
    public void inOrder() {
        System.out.print("In-order: ");
        inOrder(root);
        System.out.println();
    }
    // Pre-order Traversal (Root, Left, Right)
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void preOrder() {
        System.out.print("Pre-order: ");
        preOrder(root);
       System.out.println();
    }
    // Post-order Traversal (Left, Right, Root)
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
           System.out.print(root.data + " ");
        }
   }
   public void postOrder() {
        System.out.print("Post-order: ");
        postOrder(root);
        System.out.println();
    }
}


//output: 
//In-order: 80 40 20 50 10 60 30 70 
//Pre-order: 10 20 40 80 50 30 60 70 
//Post-order: 80 40 50 20 60 70 30 10 
