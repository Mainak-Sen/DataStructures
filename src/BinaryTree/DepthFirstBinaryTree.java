package BinaryTree;

public class DepthFirstBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Depth_First_Traversal dft=new Depth_First_Traversal();
		dft.root=new BT_Node(1);
		dft.root.left=new BT_Node(2);
		dft.root.right=new BT_Node(3);
		dft.root.left.left=new BT_Node(4);
		dft.root.left.right=new BT_Node(5);
		System.out.println("Preorder traversal of the above binary tree is:");
		dft.pre_order_traversal(dft.root);
		System.out.println();
		System.out.println("Postorder traversal of the above binary tree is:");
		dft.post_order_traversal(dft.root);
		System.out.println();
		System.out.println("Inorder traversal of the above binary tree is:");
		dft.inorder_traversal(dft.root);

	}

}
