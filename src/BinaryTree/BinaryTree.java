package BinaryTree;

public class BinaryTree {
BT_Node root;

//BinaryTree constructor
public BinaryTree() {
	this.root=null;
}

public void print_level_order() {

int h=get_height(root);
for(int i=1;i<=h;i++)
{
	print_at_given_level(root,i);
	System.out.println();//to print the nodes at various levels
}
	
}

public int get_height(BT_Node root) {
if(root==null) {
	return 0;
}
else
{
	int l_height=get_height(root.left);
	int r_height=get_height(root.right);
	if(l_height>r_height)
	{
		return l_height+1;
	}
	else
	{
		return r_height+1;
	}
}

}

public void print_at_given_level(BT_Node root,int level) {

	if(root==null)
	{
		return;
	}
	if(level==1)
	{
		System.out.print(root.data+" ");
	}
	else if(level>1)
	{
		print_at_given_level(root.left,level-1);
		print_at_given_level(root.right,level-1);
	}
}
}
