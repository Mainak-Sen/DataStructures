package BinaryTree;

public class BST_Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(50); 
        bst.insert(30); 
        bst.insert(20); 
        bst.insert(40); 
        bst.insert(70); 
        bst.insert(60); 
        bst.insert(80);
        
        //to test if its inserted properly as per BST properties,we can call the inorder traversal functiom
        // to see if the nodes appear in ascending order,because thats how it should be 
        
         bst.bst_inorder();

	}

}
