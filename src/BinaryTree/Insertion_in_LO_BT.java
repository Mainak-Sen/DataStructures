package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion_in_LO_BT {

BT_Node root;
//inorder traversal to test the tree before and after insertion
/*The idea is to do iterative level order traversal of the given tree using queue. 
 * If we find a node whose left child is empty, we make new key as left child of the node. 
 * Else if we find a node whose right child is empty, we make new key as right child. 
 * We keep traversing the tree until we find a node whose either left or right is empty.
filter_none*/
public void inorder_traversal(BT_Node root) {
	if(root==null)
	{
		return;
	}
	inorder_traversal(root.left);
	System.out.print(root.data+" ");
	inorder_traversal(root.right);	
}
//we will insert  the key into the binary tree at first position available in level order.	
public void insert_key(BT_Node root,int key)
{
	Queue<BT_Node> q=new LinkedList<BT_Node>();
	q.add(root);
	while(!q.isEmpty())
	{
		BT_Node temp=q.poll();
		if(temp.left==null)
		{
			temp.left=new BT_Node(key);
			break;
		}
		else
		{
			q.add(temp.left);
		}
		
		if(temp.right==null)
		{
			temp.right=new BT_Node(key);
			break;
		}
		else
		{
			q.add(temp.right);
		}
	}
}
}
