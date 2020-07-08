package BinaryTree;

public class Depth_First_Traversal {

BT_Node root;
Depth_First_Traversal(){
	root=null;
}

public void pre_order_traversal(BT_Node root) {
if(root==null)
{
	return;
}
System.out.print(root.data+" ");
pre_order_traversal(root.left);
pre_order_traversal(root.right);
}
public void post_order_traversal(BT_Node root) {
	if(root==null)
	{
		return;
	}
	post_order_traversal(root.left);
	post_order_traversal(root.right);
	System.out.print(root.data+" ");	
}

public void inorder_traversal(BT_Node root) {
	if(root==null)
	{
		return;
	}
	inorder_traversal(root.left);
	System.out.print(root.data+" ");
	inorder_traversal(root.right);	
}
}
