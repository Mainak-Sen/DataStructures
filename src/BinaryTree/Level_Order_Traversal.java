package BinaryTree;

public class Level_Order_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BinaryTree bt=new BinaryTree();
		bt.root=new BT_Node(1);
		bt.root.left=new BT_Node(2);
		bt.root.right=new BT_Node(3);
		bt.root.left.left=new BT_Node(4);
		bt.root.left.right=new BT_Node(5);
		bt.print_level_order();
		//System.out.println();*/
		//bt.print_at_given_level(bt.root,1);
		
		//LevelOrder traversal using queue
		BT_LOT_WithQueue lotq=new BT_LOT_WithQueue();
		lotq.root=new BT_Node(1);
		lotq.root.left=new BT_Node(2);
		lotq.root.right=new BT_Node(3);
		lotq.root.left.left=new BT_Node(4);
		lotq.root.left.right=new BT_Node(5);
		lotq.print_level_order();

	}

}
