package BinaryTree;

public class BST_Delete {

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
        
        /*System.out.println("Inorder traversal of the given tree"); 
        bst.bst_inorder();
  
        System.out.println("\nDelete 20"); 
        bst.delete_key(20);
        System.out.println("Inorder traversal of the modified tree"); 
        bst.bst_inorder(); 
  
        System.out.println("\nDelete 30"); 
        bst.delete_key(30); 
        System.out.println("Inorder traversal of the modified tree"); 
        bst.bst_inorder(); 
  
        System.out.println("\nDelete 50"); 
        bst.delete_key(50); 
        System.out.println("Inorder traversal of the modified tree"); 
        bst.bst_inorder(); */
        
        System.out.println(bst.min_value(bst.root));
        System.out.println(bst.max_value(bst.root));

	}

}
