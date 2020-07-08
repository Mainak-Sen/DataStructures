package BinaryTree;

public class Insertion_BT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion_in_LO_BT insert_BT=new Insertion_in_LO_BT();
		BT_Node root=new BT_Node(10);
		root.left = new BT_Node(11); 
		root.left.left = new BT_Node(7); 
		root.right = new BT_Node(9); 
		root.right.left = new BT_Node(15); 
		root.right.right = new BT_Node(8); 
		
		//Inorder traversal before insertion of key
		insert_BT.inorder_traversal(root);
		System.out.println();
		//inserting key
		insert_BT.insert_key(root,12);
		
		//Inorder traversal after insertion of key
		insert_BT.inorder_traversal(root);
	}

}
