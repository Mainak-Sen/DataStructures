package BinaryTree;
//program to insert a key into a BST and test with inorder traversal whether the function is working 
public class BinarySearchTree {
BT_Node root;
BinarySearchTree(){
	this.root=null;
}

public void insert(int key) {
	root=insert_key(root,key);
}
public BT_Node insert_key(BT_Node root,int key)
{
	if(root==null)
	{
		root=new BT_Node(key);
	}
	else if(key<root.data)
	{
	    root.left=insert_key(root.left,key);
	}
	else if(key>root.data)
	{
	    root.right=insert_key(root.right,key);
	}
	else
	{
		System.out.println("Duplicates not allowed");
	}
	return root;
}
public void bst_inorder() {
	bst_inorder_rec(root);
}

public void bst_inorder_rec(BT_Node root) {
	if(root==null)
	{
		return;
	}
	else
	{
		bst_inorder_rec(root.left);
		System.out.print(root.data+" ");
		bst_inorder_rec(root.right);
	}
}
//bst_postorder traversal
public void bst_postorder_rec(BT_Node root) {
	if(root==null)
	{
		return;
	}
	else
	{
		bst_postorder_rec(root.left);
		bst_postorder_rec(root.right);
		System.out.print(root.data+" ");	
	}
}
//function to find min_value in a BST
public int min_value(BT_Node root) {
	int min_value=root.data;
	while(root.left!=null)
	{
		min_value=root.left.data;
		root=root.left;
	}
	return min_value;
}

//function to find max_value in a BST
public int max_value(BT_Node root) {
	int max_value=root.data;
	while(root.right!=null)
	{
		max_value=root.right.data;
		root=root.right;
	}
	return max_value;
}
public void delete_key(int key)
{
	root=deleteRec(root,key);
}
//recursive function to delete a key from a BST
//first we will find the node to delete ,then we will delete the node according to the 3 conditions which arise
public BT_Node deleteRec(BT_Node root,int key) {
	if (root==null) {
		return root;
	}
	else if(key<root.data)
	{
		root.left=deleteRec(root.left,key);//record should be looked for in left subtree ->find work
	}
	else if(key>root.data)
	{
		root.right= deleteRec(root.right,key);//record should be looked for in right subtree -> find work
	}
	else
	{
	    if(root.left!=null && root.right!=null){
	    int min_value=min_value(root.right);
	    root.data=	min_value;//copy the min value of right subtree to the node to be deleted/you can call it inorder successor too
	    root.right=deleteRec(root.right,root.data);
	    }
	    else if(root.left==null) {root= root.right;}// if only  right child is there copy its content to the node and delete the child
	    else if(root.right==null) {root= root.left;} //same for only left child
	    else
	    {
	    	root=null;
	    }
    }
	return root;
}
}