package BinaryTree;

public class Driver_BSTPre {
	BT_Node root=null;
	private BT_Node construct_BST(int[] pre_array)
	{
		root=new BT_Node(pre_array[0]);
		for(int i=1;i<pre_array.length;i++)
		{
			insert_intoBST(root,pre_array[i]);
		}
		return root;
	}
	private static BT_Node insert_intoBST(BT_Node root, int value) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return new BT_Node(value);
		}
		else
		{
			if(value<root.data)
			{
				root.left=insert_intoBST(root.left,value);
			}
			else if(value>root.data)
			{
				root.right=insert_intoBST(root.right,value);
			}
			else
			{
			   throw new RuntimeException("Duplicates not allowed in Binary Search Tree");
			}
		}
		return root;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given preorder traversal of BST
		int[] pre_array= {10, 5, 1, 7, 40, 50};	
		Driver_BSTPre bst_pre=new Driver_BSTPre();
		BinarySearchTree bst=new BinarySearchTree();
		BT_Node root=bst_pre.construct_BST(pre_array);
		//printing inorder traversal of the created BST
		bst.bst_inorder_rec(root);
		//printing post_order_traversal of the created BST
		System.out.println();
		bst.bst_postorder_rec(root);
		System.out.println();
		//printing left-most node of a BST from its given pre_order traversal
		System.out.println(bst.min_value(root.left));
		//printing right-most node of a BST from its given pre_order traversal	
		System.out.println(bst.max_value(root.right));
		
		//printing the leaf nodes of the constructed BST:
		//System.out.println();
		//System.out.print(bst.min_value(root.left)+" "+bst.max_value(root.left)+" "+bst.min_value(root.right)+" "+bst.max_value(root.right));
		

	}

}
